<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
2


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

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] dp = new int[N + 1][N + 1];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            int[][] dp_new = new int[N + 1][N + 1];
            for (int j = 0; j < N + 1; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % 1000000007;
                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (N - j - k)) % 1000000007;
                    }
                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % 1000000007;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}
```
Note that the `mod` variable is set to `1000000007` in both the Python and Java code, which is the same as the value in the Python code.

Also, the `eps` variable is not used in the Java code, as it is not necessary to perform floating-point arithmetic in this problem.

I hope this helps! Let me know if you have any questions.</s>
