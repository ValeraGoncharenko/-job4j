package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        List<Account> presentAccount;
        if (user != null) {
            presentAccount = users.get(user);
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
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя в системе по реквизитам.
     * @param passport - пасспорт пользователя.
     * @param requisite - реквизиты пользователя.
     * @return - счет.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> account;
        if (user != null) {
            account = users.get(user);
            for (Account score : account) {
                if (score.getRequisite().equals(requisite)) {
                    return score;
                }
            }

        }
        return null;
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
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() > 0 && destAccount != null) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }

        return rsl;
    }
}
