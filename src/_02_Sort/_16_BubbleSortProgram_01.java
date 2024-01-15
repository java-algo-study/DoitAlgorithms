package _02_Sort;

import java.util.Scanner;

public class _16_BubbleSortProgram_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 버블 소트를 사용하여 배열을 정렬
        for (int i = 1; i <= N; i++) {
            boolean changed = false;
            for (int j = 0; j < N - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    changed = true;
                }
            }
            // swap이 일어나지 않았다면 반복 횟수 출력하고 종료
            if (!changed) {
                System.out.println(i);
                break;
            }
        }

        scanner.close();
    }
}
