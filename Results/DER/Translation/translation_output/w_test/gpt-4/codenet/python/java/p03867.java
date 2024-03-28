Here is the Python code translated into Java, enclosed within ```java``` as you requested:

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final int MOD = 1000000007;

        List<Integer> div = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
        }

        Collections.sort(div);
        int N1 = div.size();
        long[] num = new long[N1 + 1];
        long ans = 0;
        for (int i = 0; i < N1; i++) {
            num[i] = pow(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = (num[i] - num[j] + MOD) % MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += (long)div.get(i) * num[i] / 2;
                ans %= MOD;
            } else {
                ans += (long)div.get(i) * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
        scanner.close();
    }

    public static long pow(long a, long b, int MOD) {
        long result = 1;
        a = a % MOD;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            b = b >> 1;
            a = (a * a) % MOD;
        }
        return result;
    }
}
```

This Java code mirrors the functionality of the Python code. It accepts two integers, N and K, from the user input, computes the divisors of N, and uses them to calculate the final answer. Note that I have created a `pow` function that performs modular exponentiation because Java's standard library does not include a built-in function with a modulus parameter.
