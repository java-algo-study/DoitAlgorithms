package _01_DataStructure;

import java.util.Scanner;

public class _09_SlidingWindow {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int S = scanner.nextInt();
    int P = scanner.nextInt();
        scanner.nextLine();
    String DNA = scanner.nextLine();
    int[] required = new int[4];

        for(int i = 0; i < 4; ++i) {
        required[i] = scanner.nextInt();
    }

    int[] count = new int[4];
    int goodCount = 0;

    int i;
        for(i = 0; i < P; ++i) {
        ++count[index(DNA.charAt(i))];
    }

        if (isGood(count, required)) {
        ++goodCount;
    }

        for(i = P; i < S; ++i) {
        --count[index(DNA.charAt(i - P))];
        ++count[index(DNA.charAt(i))];
        if (isGood(count, required)) {
            ++goodCount;
        }
    }

        System.out.println(goodCount);
        scanner.close();
}

    private static int index(char ch) {
        switch (ch) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isGood(int[] count, int[] required) {
        for(int i = 0; i < 4; ++i) {
            if (count[i] < required[i]) {
                return false;
            }
        }

        return true;
    }
}
