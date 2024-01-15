package _01_DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class _07_주몽 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] materials = new int[N];

        int count;
        for (count = 0; count < N; ++count) {
            materials[count] = scanner.nextInt();
        }

        Arrays.sort(materials);
        count = 0;
        int left = 0;
        int right = N - 1;

        while (left < right) {
            int sum = materials[left] + materials[right];
            if (sum == M) {
                ++count;
                ++left;
                --right;
            } else if (sum < M) {
                ++left;
            } else {
                --right;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
