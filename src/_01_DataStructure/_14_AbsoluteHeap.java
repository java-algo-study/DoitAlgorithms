package _01_DataStructure;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _14_AbsoluteHeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 절댓값을 비교하는 커스텀 Comparator로 우선순위 큐(힙)를 생성합니다.
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 == abs2) {
                    return o1 - o2; // 절댓값이 같으면 실제 값으로 비교
                }
                return abs1 - abs2; // 절댓값이 다르면 절댓값으로 비교
            }
        });

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                if (heap.isEmpty()) {
                    System.out.println(0); // 힙이 비어있으면 0 출력
                } else {
                    System.out.println(heap.poll()); // 힙에서 가장 작은 원소(절댓값 기준) 제거 및 출력
                }
            } else {
                heap.add(x); // 힙에 새로운 원소 추가
            }
        }

        scanner.close();
    }
}

