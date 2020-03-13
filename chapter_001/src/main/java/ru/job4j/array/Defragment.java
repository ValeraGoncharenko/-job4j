package ru.job4j.array;


public class Defragment {
//    Для выполнения этой задачи нужно использовать: цикл for с индексом,
//    цикл while для поиска заполненной ячейки,
//    оператор условия if.

    public static String[] compress(String[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] == null) {
                    array[j] = array[j + 1];
                    array[j + 1] = null;
                }
            }


               // System.out.print(array[index] + " ");
            }


        return array;
    }

        public static void main (String[]args){
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
    }


