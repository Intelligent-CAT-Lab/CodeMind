<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-7

```
N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final long MOD = (long) Math.pow(10, 9) + 7;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long inverseQ = pow(q, MOD - 2, MOD);
        System.out.println((p * inverseQ) % MOD);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a, b / 2, m);
        if (b % 2 == 0) {
            return (p * p) % m;
        } else {
            return (((p * p) % m) * a) % m;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the factorial of `N + K - 1` modulo `MOD`, and then calculates the inverse of `q` modulo `MOD`. The result is the product of `p` and the inverse of `q` modulo `MOD`.

The `pow` method is a helper method that calculates the power of a number modulo another number using the binary exponentiation algorithm.
<|EOT|>
