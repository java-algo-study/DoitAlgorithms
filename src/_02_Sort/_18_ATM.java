package _02_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class _18_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] times = new int[N];

        for (int i = 0; i < N; i++) {
            times[i] = scanner.nextInt();
        }

        // 인출 시간을 오름차순으로 정렬
        Arrays.sort(times);

        int totalTime = 0;
        int accumulatedTime = 0;
        for (int time : times) {
            accumulatedTime += time; // 각 사람이 돈을 인출하는데 걸리는 시간을 누적합니다.
            totalTime += accumulatedTime; // 총 대기 시간에 누적 시간을 더합니다.
        }

        System.out.println(totalTime);
        scanner.close();
    }
}

