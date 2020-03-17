package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            int count = 0;
            while (count < array.length) {
                if (array[count] == null) {
                    array[count] = array[index + 1];
                    array[index + 1] = null;
                }
                count++;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

        public static void main(String[]args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
    }


