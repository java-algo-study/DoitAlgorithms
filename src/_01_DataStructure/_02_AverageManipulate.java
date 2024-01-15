package _01_DataStructure;

import java.util.Scanner;

public class _02_AverageManipulate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        scanner.nextLine();
        String eachScore = scanner.nextLine();
        String[] numberOfScore = eachScore.split(" ");
        int[] score = new int[numbers];
        int highScore = 0;

        for(int i = 0; i < numbers; ++i) {
            score[i] = Integer.parseInt(numberOfScore[i]);
            if (score[i] > highScore) {
                highScore = score[i];
            }
        }

        double average = 0.0;
        int sum = 0;

        for(int i = 0; i < numbers; ++i) {
            sum += score[i];
            average = (double)(sum * 100 / highScore / numbers);
        }

        System.out.println(average);
    }
    }

