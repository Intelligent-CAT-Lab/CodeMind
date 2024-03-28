import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = primeFactorization(n);
        int val = 1;
        for (Integer v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size() + " " + (val - 1));
    }

    public static Map<Integer, Integer> primeFactorization(int n) {
        if (n <= 1) {
            return null;
        }
        int numSqrt = (int) Math.sqrt(n);
        ArrayList<Integer> primeList = makePrimeList(numSqrt);
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
        if (n != 1) {
            if (dictCounter.containsKey(n)) {
                dictCounter.put(n, dictCounter.get(n) + 1);
            } else {
                dictCounter.put(n, 1);
            }
        }
        return dictCounter;
    }

    public static ArrayList<Integer> makePrimeList(int num) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            primeList.add(i);
        }
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