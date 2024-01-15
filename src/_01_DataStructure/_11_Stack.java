package _01_DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class _11_Stack {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; ++i) {
            sequence[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        int num = 1;

        for (int i = 0; i < n; ++i) {
            int current = sequence[i];

            while (num <= current) {
                stack.push(num++);
                sb.append("+\n");
            }

            if ((Integer) stack.peek() != current) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}

