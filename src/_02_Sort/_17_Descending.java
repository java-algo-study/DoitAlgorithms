package _02_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class _17_Descending {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    String numberStr = scanner.next();
    char[] numbers = numberStr.toCharArray();
        Arrays.sort(numbers);

        for(int i = numbers.length - 1; i >= 0; --i) {
        System.out.print(numbers[i]);
    }

        scanner.close();
}
}

