import java.util.*;
import java.lang.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> primes = makePrimeNumbers(2000);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int prime : primes) {
            if (prime % 10 == 1) {
                ans.add(prime);
            }
            if (ans.size() == n) {
                break;
            }
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> makePrimeNumbers(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNumbers) {
                if (p > Math.sqrt(i)) {
                    break;
                }
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}