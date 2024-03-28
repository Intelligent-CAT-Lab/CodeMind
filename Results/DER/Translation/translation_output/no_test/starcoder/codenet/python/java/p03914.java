<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    static double eps = 1e-9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] dp = new int[N+1][N+1];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            int[][] dp_new = new int[N+1][N+1];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
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
<|endoftext|>
