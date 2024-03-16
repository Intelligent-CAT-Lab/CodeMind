<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
for n in range(0, N+1):
    D[n][1] = 1
for k in range(1, K+1):
    D[0][k] = 1
for n in range(1, N+1):
    for k in range(1, K+1):
        if n >= k:
            D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD
        else:
            D[n][k] = D[n][n]
print(D[N][K])


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;

        int[][] D = new int[N + 1][K + 1];
        Arrays.fill(D[0], 1);
        Arrays.fill(D[1], 1);

        for (int n = 2; n <= N; n++) {
            for (int k = 2; k <= K; k++) {
                if (n >= k) {
                    D[n][k] = (D[n - k][k] + D[n][k - 1]) % MOD;
                } else {
                    D[n][k] = D[n][n];
                }
            }
        }

        System.out.println(D[N][K]);
    }
}
```</s>
