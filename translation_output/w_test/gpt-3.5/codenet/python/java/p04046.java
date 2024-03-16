```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long MOD = (long) 1e9 + 7;

        long[] factorial = new long[H + W + 1];
        long[] inv_factorial = new long[H + W + 1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i < H + W + 1; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD - 2, MOD);
        }

        long answer = 0;

        for (int i = B + 1; i <= W; i++) {
            answer += f(H - A, i, factorial, inv_factorial) * f(A, W - i + 1, factorial, inv_factorial) % MOD;
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long f(int h, int w, long[] factorial, long[] inv_factorial) {
        return (factorial[h + w - 2] * inv_factorial[h - 1] % MOD * inv_factorial[w - 1]) % MOD;
    }

    public static long pow(long base, long exponent, long MOD) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}
```

