import java.util.*;
import java.io.*;

public class p02032 {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(this.primeFactorization(n));
    }

    public int primeFactorization(int n) {
        if (n <= 1) {
            return 0;
        }
        int numSqrt = (int) Math.sqrt(n);
        List<Integer> primeList = this.makePrimeList(numSqrt);
        Map<Integer, Integer> dictCounter = new HashMap<>();
        for (int prime : primeList) {
            while (n % prime == 0) {
                if (dictCounter.containsKey(prime)) {
                    dictCounter.put(prime, dictCounter.get(prime) + 1);
                } else {
                    dictCounter.put(prime, 1);
                }
                n /= prime;
            }
        }
        if (n!= 1) {
            if (dictCounter.containsKey(n)) {
                dictCounter.put(n, dictCounter.get(n) + 1);
            } else {
                dictCounter.put(n, 1);
            }
        }
        int val = 1;
        for (int v : dictCounter.values()) {
            val *= (v + 1);
        }
        return dictCounter.size() + val - 1;
    }

    public List<Integer> makePrimeList(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            primeList.add(i);
        }
        primeList.set(0, 0);
        primeList.set(1, 0);
        int numSqrt = (int) Math.sqrt(num);
        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > numSqrt) {
                break;
            }
            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList.set(nonPrime, 0);
            }
        }
        return primeList;
    }
}