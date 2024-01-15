package _01_DataStructure;

import java.util.Scanner;

public class _03_RangeOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();  // 숫자의 개수
        int addCounter = scanner.nextInt();  // 합을 구해야 하는 횟수
        scanner.nextLine();

        int[] numberOfArray = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            numberOfArray[i] = scanner.nextInt();
        }

        // 합 배열을 계산합니다.
        int[] sumByArray = new int[numbers];
        sumByArray[0] = numberOfArray[0];
        for (int i = 1; i < numbers; i++) {
            sumByArray[i] = sumByArray[i - 1] + numberOfArray[i];
        }

        // 범위에 대한 합을 계산합니다.
        for (int i = 0; i < addCounter; i++) {
            int start = scanner.nextInt() - 1;  // 범위 시작 (0 기반 인덱스로 조정)
            int end = scanner.nextInt() - 1;    // 범위 끝 (0 기반 인덱스로 조정)

            if (start == 0) {
                System.out.println(sumByArray[end]);
            } else {
                System.out.println(sumByArray[end] - sumByArray[start - 1]);
            }
        }
        scanner.close();
    }
}

