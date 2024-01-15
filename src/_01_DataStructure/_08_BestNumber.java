package _01_DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class _08_BestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] numbers = new long[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextLong();
        }

        // 수 정렬
        Arrays.sort(numbers);

        int goodNumberCount = 0;
        // 각 수가 좋은 수인지 확인
        for (int i = 0; i < N; i++) {
            if (isGoodNumber(numbers, i)) {
                goodNumberCount++;
            }
        }

        System.out.println(goodNumberCount);
        scanner.close();
    }

    // 주어진 수가 다른 두 수의 합으로 표현될 수 있는지 확인하는 메소드
    private static boolean isGoodNumber(long[] numbers, int index) {
        int left = 0;
        int right = numbers.length - 1;
        long target = numbers[index];

        while (left < right) {
            // 현재 인덱스의 수는 제외하고 계산
            if (left == index) left++;
            else if (right == index) right--;
            else {
                long sum = numbers[left] + numbers[right];

                if (sum == target) return true;
                else if (sum < target) left++;
                else right--;
            }
        }

        return false;
    }
}


