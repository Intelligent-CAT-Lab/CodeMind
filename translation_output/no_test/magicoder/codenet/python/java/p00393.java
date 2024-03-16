<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
MOD = 1000000007

N, M = (int(x) for x in input().split())

pow = [0] * (N + 1)
dp = [0] * (N + 1)

pow[0] = 1

for i in range(1, N + 1):
    pow[i] = pow[i - 1] * 2
    pow[i] %= MOD

dp[0] = 1

for i in range(1, M + 1):
    dp[i] = pow[i]

dp[M] -= 1

for i in range(M + 1, N + 1):
    dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])
    dp[i] %= MOD

print((pow[N] - dp[N] + MOD) % MOD)


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MOD = 1000000007;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] pow = new long[N + 1];
        long[] dp = new long[N + 1];

        pow[0] = 1;

        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }

        dp[0] = 1;

        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }

        dp[M] -= 1;

        for (int i = M + 1; i <= N; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]);
            dp[i] %= MOD;
        }

        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the standard input, calculates the powers of 2 modulo MOD, and then uses dynamic programming to calculate the result. The result is printed to the standard output.<｜end▁of▁sentence｜>
