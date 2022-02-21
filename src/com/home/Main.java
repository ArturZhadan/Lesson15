package com.home;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 30, 5, 70, 44};
        arrayPrint(array);
        reverseArray(array);
        arrayPrint(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
                int tmp = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-i-1] = tmp;
            }
        }

    public static void arrayPrint(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
