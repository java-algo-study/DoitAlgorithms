package _01_DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _13_CardGame {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    Queue<Integer> queue = new LinkedList();

        for(int i = 1; i <= N; ++i) {
        queue.offer(i);
    }

        while(queue.size() > 1) {
        queue.poll();
        queue.offer((Integer)queue.poll());
    }

        System.out.println(queue.poll());
        scanner.close();
}
}

