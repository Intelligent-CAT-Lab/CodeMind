<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    static int mod = (int)1e9+7;
    static double eps = Math.pow(10, -9);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] dp = new long[N+1][N];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            long[][] dp_new = new long[N+1][N];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k+1 < N)
                        dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k] * (N - j - k)) % mod;
                    if (j+k <= N)
                        dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k] * j) % mod;
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the standard input, initializes a 2D array dp with size (N+1)xN and sets dp[1][0] to 1. Then it iterates M times, updating dp with a new 2D array dp_new. After M iterations, it prints the value in dp[N][0].
<|EOT|>
