package _01_DataStructure;

import java.util.Scanner;

public class _04_RangeOfSum_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array = new int[N + 1][N + 1];
        int[][] sumArray = new int[N + 1][N + 1];

        // 2차원 배열에 수 저장
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                array[i][j] = scanner.nextInt();
                sumArray[i][j] = sumArray[i - 1][j] + sumArray[i][j - 1] - sumArray[i - 1][j - 1] + array[i][j];
            }
        }

        // 주어진 구간에 대한 합 계산
        for (int i = 0; i < M; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            int sum = sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1];
            System.out.println(sum);
        }

        scanner.close();
    }
}

