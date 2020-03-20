package ru.job4j.oop;

public class DummyDic {
    String engToRus(String eng){
        String a = "Неизвестное слово. " + eng;
        return a;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String b = dummyDic.engToRus("slovo");
        System.out.println(b);
    }
}
