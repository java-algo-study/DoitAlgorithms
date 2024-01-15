package _01_DataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class _10_FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 숫자의 개수
        int L = scanner.nextInt(); // 슬라이딩 윈도우의 크기
        Deque<Integer[]> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int current = scanner.nextInt();

            // 덱에서 현재 값보다 큰 수를 모두 제거
            while (!deque.isEmpty() && deque.peekLast()[0] > current) {
                deque.pollLast();
            }

            // 현재 값과 인덱스를 덱에 추가
            deque.offerLast(new Integer[]{current, i});

            // 윈도우 시작 인덱스가 유효 범위 밖으로 벗어나면 덱에서 제거
            while (deque.peekFirst()[1] <= i - L) {
                deque.pollFirst();
            }

            // 윈도우의 크기가 L이 되면 최솟값 출력
            if (i >= L - 1) {
                System.out.print(deque.peekFirst()[0] + " ");
            }
        }

        scanner.close();
    }
}

