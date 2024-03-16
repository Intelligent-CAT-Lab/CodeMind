Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        final int P = 1000000007;
        long[] X = new long[K + 1];
        long ans = 0;

        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans = (ans + X[i] * pow(K / i, N, P)) % P;
        }
        System.out.println(ans);
    }

    private static long pow(int a, int b, int P) {
        long result = 1;
        long base = a;

        while (b > 0) {
            if (b % 2 == 1) result = (result * base) % P;
            base = (base * base) % P;
            b /= 2;
        }

        return result;
    }
}
```

Here's a brief explanation of the code changes I've made:

1. Java does not support multiple assignment like in Python, so I've read `N` and `K` separately with a `Scanner`.
2. Java doesn't have built-in big number arithmetic for modulus, so I have implemented a `pow` method for efficient modular exponentiation.
3. Instead of using `list` as in Python, I've used an array of `long` to store the sequence `X` because we might be dealing with numbers exceeding `Integer` limits and we need modulo arithmetic for large numbers.
4. For `print`, Java uses `System.out.println` instead.
5. In Java, `%` operator is used for taking modulus.
6. The loop syntax has been adjusted to the Java-style for-loop.
7. I've added `final` keyword to `P` variable to make it a constant, which is a common practice in Java for defining constants.
