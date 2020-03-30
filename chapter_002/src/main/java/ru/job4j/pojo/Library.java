package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book adventures = new Book("Treasure Island", 240);
        Book detectives = new Book("Sherlock Holmes ", 350);
        Book fantasy = new Book("Roadside Picnic", 400);
        Book training = new Book("Clean code", 200);

        Book [] books = new Book[4];
        books[0] = adventures;
        books[1] = detectives;
        books[2] = fantasy;
        books[3] = training;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        System.out.println("Переставьте книгу с индексом 0 и 3 и выведете на консоль");
        for (int i = 0; i < books.length; i++) {
            Book temp;
            if (i == 0){
                temp = books[i];
                books[i] = books[3];
                books[3] = temp;
            }
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")){
                System.out.println(bk.getName()+ " - " + bk.getCount());
            }
        }



    }
}
