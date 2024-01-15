package _01_DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class _12_NGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        int[] nge = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && sequence[stack.peek()] < sequence[i]) {
                nge[stack.pop()] = sequence[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(nge[i] + " ");
        }

        scanner.close();
    }
}
