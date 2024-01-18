package _01_DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class _11_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder bf = new StringBuilder();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < numbers.length; i++) {
            int su = numbers[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}