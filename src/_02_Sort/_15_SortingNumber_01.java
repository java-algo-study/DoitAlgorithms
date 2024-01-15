package _02_Sort;

import java.util.Scanner;

public class _15_SortingNumber_01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 버블 정렬 알고리즘
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 숫자를 교환
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
