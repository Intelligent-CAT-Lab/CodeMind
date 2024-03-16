Below is the translation of the provided Python code to Java. The Java code reads an integer input from the standard console, calculates its prime factorization, and then prints out two numbers: the number of distinct prime factors and the sum of the powers of all prime factors minus one.

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Integer, Integer> d = primeFactorization(n);
        int val = 1;
        for (int v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size() + " " + (val - 1));
    }

    private static ArrayList<Integer> makePrimeList(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }

        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                primeList.add(i);
            }
        }

        return primeList;
    }

    private static HashMap<Integer, Integer> primeFactorization(int num) {
        if (num <= 1) {
            return new HashMap<>();
        }

        int numSqrt = (int) Math.sqrt(num);
        ArrayList<Integer> primeList = makePrimeList(numSqrt);

        HashMap<Integer, Integer> dictCounter = new HashMap<>();
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
```
Please make sure to execute this code in an environment that supports Java standard input and output.
