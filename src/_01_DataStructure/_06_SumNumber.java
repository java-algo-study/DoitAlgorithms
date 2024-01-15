package _01_DataStructure;

import java.util.Scanner;

public class _06_SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0; // 연속된 자연수의 합으로 나타내는 가짓수
        int sum = 0; // 연속된 수의 합
        int start = 1; // 시작 포인터
        int end = 1; // 끝 포인터

        while (start <= N) {
            if (sum < N) {
                sum += end;
                end++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                count++;
                sum -= start;
                start++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

