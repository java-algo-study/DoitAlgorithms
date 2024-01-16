package _02_Sort;

import java.util.*;


public class _22_RadixSort_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        radixSort(numbers, 10000);

        for (int number : numbers) {
            System.out.println(number);
        }
        sc.close();
    }

    private static void radixSort(int[] numbers, int maxNumber) {
        //   10개의 리스트를 저장할 리스트를 초기화
        List<Queue<Integer>> queues = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            queues.add(new LinkedList<>());
        }
        for (int exp = 1; exp <= maxNumber; exp *= 10) {
            for (int number : numbers) {
                int digit = (number / exp) % 10;
                queues.get(digit).add(number);
            }
            int index = 0;
            for (Queue<Integer> queue : queues) {
                while (!queue.isEmpty()) {
                    numbers[index++] = queue.remove();
                }
            }
        }
    }
}

