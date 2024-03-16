```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int W = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long[] factorial = new long[H + W + 1];
        long[] inv_factorial = new long[H + W + 1];
        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i <= H + W; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
            inv_factorial[i] = modPow(factorial[i], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += f(H - A, i, factorial, inv_factorial, MOD) * f(A, W - i + 1, factorial, inv_factorial, MOD);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    public static long f(int h, int w, long[] factorial, long[] inv_factorial, int MOD) {
        return (factorial[h + w - 2] * inv_factorial[h - 1] % MOD * inv_factorial[w - 1] % MOD) % MOD;
    }

    public static long modPow(long base, long exp, long MOD) {
        long result = 1;
        base = base % MOD;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            exp = exp >> 1;
            base = (base * base) % MOD;
        }
        return result;
    }
}
```

