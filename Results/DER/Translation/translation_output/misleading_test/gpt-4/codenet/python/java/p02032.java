Here's the Python code translated into Java:

```java
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> primeList = makePrimeList((int)Math.sqrt(n));
        Map<Integer, Integer> primeFactorization = primeFactorization(n, primeList);

        int val = 1;
        for (int v : primeFactorization.values()) {
            val *= (v + 1);
        }
        System.out.println(primeFactorization.size() + " " + (val - 1));
    }

    static List<Integer> makePrimeList(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }

        int[] primeList = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            primeList[i] = i;
        }
        primeList[1] = 0;

        int numSqrt = (int)Math.sqrt(num);

        for (int prime = 0; prime <= num; prime++) {
            if (prime == 0 || primeList[prime] == 0) {
                continue;
            }
            if (prime > numSqrt) {
                break;
            }

            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList[nonPrime] = 0;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int prime : primeList) {
            if (prime != 0) {
                primes.add(prime);
            }
        }

        return primes;
    }

    static Map<Integer, Integer> primeFactorization(int num, List<Integer> primeList) {
        if (num <= 1) {
            return new HashMap<>();
        }

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
```

Please note that the `main` method is the entry point for a Java application. You must wrap code intended for execution inside a class and method to run it properly. Moreover, Java's standard I/O approach is different from Python, hence we used `BufferedReader` for reading input. Additionally, the way maps and lists work in Java is quite different from Python's dictionaries and lists, respectively.

Make sure to handle exceptions or use a `throws` declaration for methods that might throw checked exceptions, such as `IOException` when dealing with I/O operations. This code assumes that the functions `makePrimeList` and `primeFactorization` are implemented correctly according to their Python counterparts.
