Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static long[] factorial = new long[100001];
    static long[] inv_factorial = new long[100001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H + W; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += f(H - A, i) * f(A, W - i + 1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;

            exp = exp >> 1;
            base = (base * base) % mod;
        }

        return result;
    }

    static long f(int h, int w) {
        return (factorial[h + w - 2] * inv_factorial[h - 1] * inv_factorial[w - 1]) % MOD;
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the factorials and inverse factorials, and then calculates the answer. The `pow` method is used to
