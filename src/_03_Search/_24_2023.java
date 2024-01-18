package _03_Search;

import java.util.*;

public class _24_2023 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> fuckPrime = findFuckPrimes(N);

        for(int primes : fuckPrime){
            System.out.println(primes);
        }
    }

    private static List<Integer> findFuckPrimes(int N){
        List<Integer> primesList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int [] siglePrimes ={2, 3, 5, 7};
        for(int prime :siglePrimes) {
            stack.push(prime);
        }
        while (!stack.isEmpty()){
            int current =stack.pop();
            if(String.valueOf(current).length()==N){
                primesList.add(current);
            }else {
                for(int i =0; i<=9; i++){
                    int newNumber =current*10 +i;
                    if(isPrime(newNumber)){
                        stack.push(newNumber);
                    }
                }
            }
        }
        Collections.sort(primesList);
        return primesList;
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
