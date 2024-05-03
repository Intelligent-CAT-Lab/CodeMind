```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws Exception {
        resolve();
    }

    public static void resolve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Map<Integer, Integer> d = primeFactorization2(n);
        int val = 1;
        for (int v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size(), val - 1);
    }

    public static Map<Integer, Integer> primeFactorization2(int num) {
        if (num <= 1) {
            return new HashMap<>();
        } else {
            int numSqrt = (int) Math.floor(Math.sqrt(num));
            List<Integer> primeList = makePrimeList2(numSqrt);

            Map<Integer, Integer> dictCounter = new HashMap<>();
            for (int prime : primeList) {
                while (num % prime == 0) {
                    dictCounter.put(prime, dictCounter.getOrDefault(prime, 0) + 1);
                    num /= prime;
                }
            }
            if (num != 1) {
                dictCounter.put(num, dictCounter.getOrDefault(num, 0) + 1);
            }

            return dictCounter;
        }
    }

    public static List<Integer> makePrimeList2(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            primeList.add(i);
        }

        int numSqrt = (int) Math.sqrt(num);
        for (int prime : primeList) {
            if (prime > numSqrt) {
                break;
            }

            for (int nonPrime = 2 * prime; nonPr
