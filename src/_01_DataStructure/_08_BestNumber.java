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
        int start = 0;
        int end = numbers.length - 1;
        long target = numbers[index];

        while (start < end) {
            // 투포인터가 만나지 않는 이상 계속 루프진행
            if (start == index) start++;
            else if (end == index) end--;
            //현재 인덱스 제외: start 또는 end가 index와 같으면,
                // 즉 현재 target을 가리키고 있다면, 해당 포인터를 이동시켜 target을 계산에서 제외합니다.

            else {
                long sum = numbers[start] + numbers[end];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return false;
    }
}



