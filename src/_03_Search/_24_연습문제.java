package _03_Search;
//        문제: 소수 조합 찾기
//        문제 설명:
//
//        주어진 숫자들의 배열이 있습니다. 각 숫자는 한 번만 사용할 수 있습니다.
//        이 숫자들을 조합하여 만들 수 있는 모든 숫자를 찾아내고, 그 중 소수인 것들의 개수를 반환하는 프로그램을 작성하세요.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

//        제한 조건:
//
//        배열의 각 요소는 1부터 9까지의 숫자입니다.
//        배열의 길이는 1 이상 7 이하입니다.
public class _24_연습문제 {
    // 문제 해결 키
    // 1. DFS 를 이용한 숫자 조합 생성
    // 2. 소수 판별 -> 숫자의 제곱근으로 나누어 떨어지는지 확인
    // 3. 소수 카운트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String input = sc.nextLine();
        String[] numbers = input.split("");

        Set<Integer> primes = new HashSet<>();
        findPrimes(numbers,primes);

        System.out.println(primes.size());

    }
    private static void findPrimes(String [] numbers ,Set<Integer> primes){
        Stack<String> stack =new Stack<>();

        for(String number :numbers){
            stack.push(number);
        }
        while(!stack.isEmpty()){
            String current =stack.pop();
            if(isPrimes(Integer.parseInt(current))){
                primes.add(Integer.parseInt(current));
            }
            for(String number :numbers){
                if(!current.contains(number)){
                    stack.push(current+number);
                }
            }
        }
    }
    private static boolean isPrimes(int number){
        if(number <=1 )return  false;
        for(int i =2; i*i<=number; i++){
            if(number %1==0 ) return  false;
        }
        return true;
    }
}
