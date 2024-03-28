<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
-26

```
mod = 1000000007
eps = 10**-9


def main():
    import sys
    input = sys.stdin.readline

    N, M = map(int, input().split())
    dp = [[0] * N for _ in range(N+1)]
    dp[1][0] = 1
    for i in range(M):
        dp_new = [[0] * N for _ in range(N+1)]
        for j in range(N+1):
            for k in range(N):
                dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k)%mod
                if k+1 < N:
                    dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k] * (N - j - k))%mod
                if j+k <= N:
                    dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k] * j)%mod
        dp = dp_new
    print(dp[N][0])


if __name__ == '__main__':
    main()

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mod = 1000000007;
        int eps = 1000000000;
        int[][] dp = new int[N + 1][N + 1];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            int[][] dp_new = new int[N + 1][N + 1];
            for (int j = 0; j < N + 1; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}
```
This is the Java code for the given Python code. The code uses the same logic as the Python code, but it is written in Java. The `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the output. The `mod` and `eps` variables are declared and initialized as in the Python code. The `dp` array is declared and initialized as in the Python code, and the `main()` method is defined as in the Python code. The `if` statements are written in the same way as in the Python code, but the syntax is slightly different. The `for` loops are written in the same way as in the Python code, but the syntax is slightly different. The `dp_new` array is declared and initialized as in the Python code, and the `dp` array is updated as in the Python code. The `System.out.println()` method is used to print the final value of `dp[N][0]`.</s>
