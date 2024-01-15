package _02_Sort;

import java.util.Scanner;

public class _19_KNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(quickSelect(A, 0, N - 1, K - 1));
        scanner.close();
    }

    private static int quickSelect(int[] A, int low, int high, int K) {
        if (low < high) {
            int pivotIndex = partition(A, low, high);
            if (pivotIndex == K) {
                return A[pivotIndex];
            } else if (pivotIndex > K) {
                return quickSelect(A, low, pivotIndex - 1, K);
            } else {
                return quickSelect(A, pivotIndex + 1, high, K);
            }
        }
        return A[K];
    }

    private static int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

