package ru.job4j.bank;

import java.util.*;

public class BankService {

    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в хранилище если он уже есть то не добавлять.
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю.
     * @param passport - пасспорт пользователя.
     * @param account - аккаунт пользователя.
     */
    public void addAccount(String passport, Account account) {
//        User user = findByPassport(passport);
//        List<Account> presentAccount;
//        if (user != null) {
//            presentAccount = users.get(user);
//            if (!presentAccount.contains(account)) {
//                presentAccount.add(account);
//            }
//
//
        var user = findByPassport(passport);
        List<Account> presentAccount;
        if(user.isPresent()){
            presentAccount = users.get(user.get());
            if (!presentAccount.contains(account)) {
                presentAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя в системе по паспорту.
     * @param passport - пасспорт пользователя.
     * @return - пользователя.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(u -> u.getPassport().equals(passport)).findFirst();
    }

    /**
     * Метод ищет счет пользователя в системе по реквизитам.
     * @param passport - пасспорт пользователя.
     * @param requisite - реквизиты пользователя.
     * @return - счет.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        var user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(e -> e.getRequisite()
                        .equals(requisite))
                .findFirst());
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * @param srcPassport - пасспорт переводящего пользователя.
     * @param srcRequisite - реквизиты переводящего пользователя.
     * @param destPassport - пасспорт принимающего пользователя.
     * @param destRequisite - реквизиты принимающего пользователя.
     * @param amount - сумма.
     * @return - boolean.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && srcAccount.get().getBalance() > 0 && destAccount.isPresent()) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            rsl = true;
        }

        return rsl;
    }
}

