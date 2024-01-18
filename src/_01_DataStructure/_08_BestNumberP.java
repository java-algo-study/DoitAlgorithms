package _01_DataStructure;

import java.util.Arrays;
import java.util.Scanner;


public class _08_BestNumberP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long [] numbers = new long[N];

        for(int i =0; i<N; i++){
            numbers[i]=sc.nextLong();
        }

        Arrays.sort(numbers);

        // 좋은 수를 구하시 위해서
        // static 매소드 isGoodNumber 참 -> goodNumberCounter ++
        int goodNumberCounter =0;
        for(int i = 0 ;  i<N ;  i++){
            if(isGoodNumber(numbers, i)){
                goodNumberCounter ++;
            }
        }
        System.out.println(goodNumberCounter);
        sc.close();
    }
    private  static  boolean isGoodNumber(long [] number, int index){
        int start =0;
        int end = number.length-1;
        long target = number[index];

        while (start<end){
            if(start ==index){
                start++;
            } else if (end == index) {
                end--;
            }else {
                long sum = number[start]+number[end];
                if(sum == target){
                    return true;
                } else if (sum < target) {
                    start++;
                }else {
                    end--;
                }
            }
        } return  false;
    }
}



