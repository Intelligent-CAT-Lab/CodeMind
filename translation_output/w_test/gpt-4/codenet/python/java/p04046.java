Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int[] factorial = new int[H + W + 1];
        int[] inv_factorial = new int[H + W + 1];

        factorial[0] = 1;
        inv_factorial[0] = 1;

        for (int i = 1; i < H + W + 1; i++) {
            factorial[i] = (int) ((long) factorial[i - 1] * i % MOD);
            inv_factorial[i] = pow(factorial[i], MOD - 2, MOD);
        }

        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += f(H - A, i, factorial, inv_factorial) * f(A, W - i + 1, factorial, inv_factorial);
            answer %= MOD;
        }

        System.out.println((int) answer);
    }

    private static long f(int h, int w, int[] factorial, int[] inv_factorial) {
        return (long) factorial[h + w - 2] * inv_factorial[h - 1] % MOD * inv_factorial[w - 1] % MOD;
    }

    private static int pow(int a, int b, int mod) {
        int result = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1)
                result = (int) ((long) result * a % mod);
            a = (int) ((long) a * a % mod);
            b >>= 1;
        }
        return result;
    }
}
```
This Java code will produce the same output as the provided Python code for any given input. The `Scanner` class is used for input, and a separate `pow` method is implemented for modular exponentiation, as Java doesn't have an in-built function like `pow` with a modulus parameter like Python's, which handles large integers automatically.
