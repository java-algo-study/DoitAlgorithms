package _02_Sort;

import java.util.*;

public class _22_SortingNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        radixSort(numbers, 10000);

        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    private static void radixSort(int[] numbers, int maxDigits) {
        // 10개의 큐 초기화 (0부터 9까지 각 숫자에 대응)
        List<Queue<Integer>> queues = new ArrayList<>(); // 타입에 객체를 저장할 수 있는 리스트 생성
        for (int i = 0; i < 10; i++) { // 10개의 새로운 큐를 리스트에 추가
            queues.add(new LinkedList<>());
        }

        // 1부터 최대 자릿수까지 각 자릿수별로 정렬 수행
        for (int exp = 1; exp <= maxDigits; exp *= 10) {
            // 숫자를 해당 자릿수의 숫자에 맞는 큐에 넣기
            for (int number : numbers) {
                int digit = (number / exp) % 10; // 나머지를 통해 현재 처리 중인 자리수 나타내기
                queues.get(digit).add(number);  // 큐선택, 선택된 큐에 넘버 추가
            }

            // 큐에서 숫자를 꺼내어 배열에 다시 채우기
            int index = 0;
            for (Queue<Integer> queue : queues) { // 0 부터 9 까지의 모든 큐를 순회
                while (!queue.isEmpty()) { // 큐가 비어 있지 않은 동안 계속 반복
                    numbers[index++] = queue.remove(); // 큐에서 숫자를 꺼내서 현재 인덱스에 해당하는 배열 위치에 저장
                }
            }
        }
    }
}
