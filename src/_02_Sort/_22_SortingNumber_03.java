package _02_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _22_SortingNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        radixSort(numbers, 10000);

        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    private static void radixSort(int[] numbers, int maxNumber) {
        int exp = 1;
        while (maxNumber / exp > 0) {
            countSort(numbers, exp);
            exp *= 10;
        }
    }

    private static void countSort(int[] numbers, int exp) {
        int[] output = new int[numbers.length];
        int[] count = new int[10];

        for (int number : numbers) {
            count[(number / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            output[count[(numbers[i] / exp) % 10] - 1] = numbers[i];
            count[(numbers[i] / exp) % 10]--;
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = output[i];
        }
    }
}

