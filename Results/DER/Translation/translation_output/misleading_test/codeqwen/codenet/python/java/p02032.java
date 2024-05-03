Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        resolve(n);
    }

    public static void resolve(int n) {
        int[] primeList = makePrimeList(n);
        Map<Integer, Integer> primeFactors = primeFactorization(n, primeList);
        int val = 1;
        for (int v : primeFactors.values()) {
            val *= (v + 1);
        }
        System.out.println(primeFactors.size(), val - 1);
    }

    public static int[] makePrimeList(int num) {
        if (num < 2) {
            return new int[0];
        }

        int[] primeList = new int[num + 1];
        primeList[1] = 0;
        int numSqrt = (int) Math.sqrt(num);

        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > numSqrt) {
                break;
            }

            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList[nonPrime] = 0;
            }
        }

        return Arrays.stream(primeList).filter(i -> i != 0).toArray();
    }

    public static Map<Integer, Integer> primeFactorization(int num, int[] primeList) {
        if (num <= 1) {
            return new HashMap<>();
        } else {
            int numSqrt = (int) Math.floor(Math.sqrt(num));
            Map<Integer, Integer> primeFactors = new HashMap<>();

            for (int prime : primeList) {
                while (num % prime == 0) {
                    primeFactors.put(prime, primeFactors.getOrDefault
