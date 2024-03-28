import java.util.*;
import java.io.*;

public class p02032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> makePrimeList(int num) {
            List<Integer> primeList = new ArrayList<>();
            if (num < 2) {
                return primeList;
            }

            for (int i = 0; i <= num; i++) {
                primeList.add(i);
            }
            primeList.set(1, 0);

            double numSqrt = Math.sqrt(num);

            for (int prime : primeList) {
                if (prime == 0) {
                    continue;
                }
                if (prime > numSqrt) {
                    break;
                }

                for (int nonPrime = 2 * prime; nonPrime < num; nonPrime += prime) {
                    primeList.set(nonPrime, 0);
                }
            }

            List<Integer> result = new ArrayList<>();
            for (int prime : primeList) {
                if (prime != 0) {
                    result.add(prime);
                }
            }

            return result;
        }

        Map<Integer, Integer> primeFactorization(int num) {
            if (num <= 1) {
                return new HashMap<>();
            }

            int numSqrt = (int) Math.floor(Math.sqrt(num));
            List<Integer> primeList = makePrimeList(numSqrt);

            Map<Integer, Integer> dictCounter = new HashMap<>();

            for (int prime : primeList) {
                while (num % prime == 0) {
                    if (dictCounter.containsKey(prime)) {
                        dictCounter.put(prime, dictCounter.get(prime) + 1);
                    } else {
                        dictCounter.put(prime, 1);
                    }
                    num /= prime;
                }
            }
            if (num != 1) {
                if (dictCounter.containsKey(num)) {
                    dictCounter.put(num, dictCounter.get(num) + 1);
                } else {
                    dictCounter.put(num, 1);
                }
            }

            return dictCounter;
        }

        Map<Integer, Integer> d = primeFactorization(n);
        int val = 1;
        for (int v : d.values()) {
            val *= (v + 1);
        }

        System.out.println(d.size() + " " + (val - 1));
    }

}