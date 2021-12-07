package pracs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac2 {
//Написать программу, которая:
//1. создает массив на 100 случайных целых чисел в диапазоне от -100 до 100.
//2. выводит количество положительных нечетных чисел в этом массиве.
    public static void main(String[] args) {
        int[] a = new int[100];

        int leftBorder = -100;
        int rightBorder = 200;

        for(int i = 0; i < a.length; i++) {
            a[i] = leftBorder + (int) (Math.random() * rightBorder);
        }

        for (int j : a) {
            if (j >= 0 && j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();

        IntStream.of(a).filter(x -> (x >= 0) && (x % 2 == 0)).forEach(x -> System.out.print(x + " "));
    }
}