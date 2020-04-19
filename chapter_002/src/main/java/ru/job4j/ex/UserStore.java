package ru.job4j.ex;

/**
 * Класс для Иерархия исключений и множественный catch.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 20,04,2020.
 */

public class UserStore {

    /**
     * Метод производит поиск юзера.
     * @param users - массив объектов User.
     * @param login - имя.
     * @throws UserNotFoundException - если юзер не найден.
     * @return User.
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
       throw new  UserNotFoundException("User is not found");
    }

    /**
     * Метод производит валидацию юзера.
     * @param user - объект юзер.
     * @throws UserInvalidException - если юзер false или имя меньше трех символов.
     * @return boolean.
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username is less than three characters");
        }
        return true;
    }

    /**
     * Метод main.
     */
    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Pe");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        }


    }
}
