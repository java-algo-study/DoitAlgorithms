package _01_DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Remainders{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        long count = 0; // (i, j) 쌍의 개수
        long sum = 0; // 누적 합
        Map<Integer, Integer> remainderCount = new HashMap<>(); // 나머지의 개수를 저장하는 맵
        remainderCount.put(0, 1); // 나머지가 0인 경우를 초기화

        // 각 원소에 대해 누적 합을 계산하고, 나머지에 대한 개수를 세어줍니다.
        for (int i = 0; i < N; i++) {
            sum += array[i];
            int remainder = (int)(sum % M);

            // 같은 나머지를 가진 이전 위치들과의 조합으로 쌍을 만들 수 있습니다.
            count += remainderCount.getOrDefault(remainder, 0);
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(count);
        scanner.close();
    }
}
