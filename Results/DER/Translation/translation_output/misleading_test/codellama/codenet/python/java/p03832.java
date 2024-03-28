<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 3 1 2

Expected output:
49

```
N, A, B, C, D = map(int, input().split())
MOD = 10 ** 9 + 7
fact = [1] * (N + 1)
frev = [1] * (N + 1)

dp = [0] * (N + 1)
dp[0] = 1

for i in range(1, N + 1):
    v = fact[i] = (fact[i - 1] * i) % MOD
    frev[i] = pow(v, MOD - 2, MOD)

Y = [None] * (N + 1)
for g in range(A, min(N // C, B) + 1):
    p = C * g
    q = D * g
    y = frev[g]
    Y[p: min(q, N) + 1: g] = (pow(y, j, MOD) * frev[j]
                              for j in range(C, min(D, N // g) + 1))
    dp[p:] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
              for j in range(p, min(q, i) + 1, g)) % MOD
              for i in range(p, N + 1))

print(dp[N] % MOD)
```
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int MOD = 1000000007;

        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];
        int[] dp = new int[N + 1];
        int[] Y = new int[N + 1];

        fact[0] = 1;
        frev[0] = 1;
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            int v = fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = (int) Math.pow(v, MOD - 2, MOD);
        }

        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[j] = (int) Math.pow(y, j, MOD) * frev[j];
            }
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
                        for j in range(p, min(q, i) + 1, g)) % MOD
                        for i in range(p, N + 1))
            }
        }

        System.out.println(dp[N] % MOD);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
Note that the `sum` method is a helper method that calculates the sum of the elements in an array. It is not a built-in method in Java, so it needs to be defined separately.</s>
