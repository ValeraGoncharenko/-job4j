package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                 count = index;
            }
            while (count < array.length) {
                    if (array[index] == null) {
                        String temp = array[index];
                        array[index] = array[count];
                        array[count] = temp;
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


