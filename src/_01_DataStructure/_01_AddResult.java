package _01_DataStructure;

import java.util.Scanner;

public class _01_AddResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        String secondNumberForAdd = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < secondNumberForAdd.length(); ++i) {
            result += Integer.parseInt(Character.toString(secondNumberForAdd.charAt(i)));
        }

        System.out.print(result);
    }
}
