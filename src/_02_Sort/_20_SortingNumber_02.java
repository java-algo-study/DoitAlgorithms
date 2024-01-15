package _02_Sort;

import java.util.Scanner;

public class _20_SortingNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        mergeSort(numbers, 0, N - 1);

        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);

            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = numbers[i++];
        }

        while (j <= right) {
            temp[k++] = numbers[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            numbers[i] = temp[k];
        }
    }
}

