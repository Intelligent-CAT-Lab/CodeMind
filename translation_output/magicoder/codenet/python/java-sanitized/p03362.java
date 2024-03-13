import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> primes = makePrimeNumbers(2000);
        List<Integer> ans = new ArrayList<>();
        for (int prime : primes) {
            if (prime % 10 == 1) {
                ans.add(prime);
            }
            if (ans.size() == n) {
                break;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + (i == ans.size() - 1 ? "\n" : " "));
        }
    }

    private static List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int prime : primeNumbers) {
                if (prime >= Math.sqrt(i) + 1) {
                    primeNumbers.add(i);
                    isPrime = false;
                    break;
                }
                if (i % prime == 0) {
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