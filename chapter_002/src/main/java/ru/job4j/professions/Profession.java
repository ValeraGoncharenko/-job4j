package ru.job4j.professions;
/**
 * Иерархия профессий.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 24.03.2020.
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private long birthday;

    public Profession() {
    }

    public Profession(String name, String surname, String education, long birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }
    /**
     * Метод возвращает имя при вызове его для любого класса Doctor, Engineer.
     *
     * @return имя.
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public long getBirthday() {
        return birthday;
    }

}
