package _01_DataStructure;

import java.util.Arrays;
import java.util.Scanner;


public class _08_BestNumberP {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int N = sc.nextInt();
    long [] numbers =new long[N];

    for(int i =0; i<N; i++){
        numbers[i]= sc.nextLong();
    }

    Arrays.sort(numbers);

    int goodNumberCounter =0;

    // 투포인터 를 구현때 -> isGoodNumber static 메소드 참일 때 goodNumberCounter ++
        for(int i = 0; i<N; i++){
            if(isGoodNumber(numbers, i)){
                goodNumberCounter++;
            }
        }
        System.out.println(goodNumberCounter);
        sc.close();
    }
    private static boolean isGoodNumber(long [] numbers, int index){
       // 투포인터를 구현하고 , sum == target 참이면 true
        int start =0;
        int end = numbers.length-1;
        long target = numbers[index];

        while(start<end){
            if(start ==index) {
                start++;
            } else if (end == index) {
                end --;
            }else {
                long sum = numbers[start]+numbers[end];
                if(sum == target){
                    return true;
                } else if (sum <target) {
                    start++;
                }else {
                    end--;
                }
            }
        }return  false;
    }


}



