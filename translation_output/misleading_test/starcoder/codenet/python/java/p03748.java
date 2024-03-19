<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
26

```
import sys
input = sys.stdin.readline

import numpy as np

MOD = 10 ** 9 + 7

N,M = map(int,input().split())

# 1åº¦ã¯èµ¤ã0åã«ãªããããªåæç¶æã ããèãã
# ç®±ã®ç¶æã0åãçµç±ãããå¦ã
dp_T = np.zeros(N+1, dtype=np.int64)
dp_F = np.ones_like(dp_T)
dp_T[0] = 1
dp_F[0] = 0

for _ in range(M):
    prev_T = dp_T
    prev_F = dp_F
    dp_T = np.zeros_like(prev_T)
    dp_F = np.zeros_like(prev_F)
    # èµ¤èµ¤
    dp_T[0:-1] += prev_T[1:]
    dp_F[1:-1] += prev_F[2:]
    dp_T[0] += prev_F[1]
    # èµ¤é
    dp_T[1:] += prev_T[1:]
    dp_F[2:] += prev_F[2:]
    dp_T[1] += prev_F[1]
    # éèµ¤
    dp_T[:-1] += prev_T[:-1]
    dp_F[:-1] += prev_F[:-1]
    # éé
    dp_T[1:] += prev_T[:-1]
    dp_F[1:] += prev_F[:-1]
    
    dp_T %= MOD
    dp_F %= MOD

answer = dp_T.sum() % MOD
print(answer)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] dp = new long[2][N+1];
        dp[0][0] = 1;
        dp[1][0] = 0;
        for(int i = 0; i < M; i++) {
            long[] temp = new long[2];
            for(int j = 0; j < 2; j++) {
                temp[j] = dp[j][0];
            }
            for(int j = 1; j < N; j++) {
                dp[0][j] = (dp[0][j] + temp[0]) % 1000000007;
                dp[1][j] = (dp[1][j] + temp[1]) % 1000000007;
            }
            dp[0][0] = (dp[0][0] + temp[1]) % 1000000007;
            dp[1][0] = 0;
            for(int j = 1; j < N; j++) {
                dp[0][j] = (dp[0][j] + dp[0][j-1]) % 1000000007;
                dp[1][j] = (dp[1][j] + dp[1][j-1]) % 1000000007;
            }
        }
        System.out.println(dp[0][N-1]);
    }
}
```

'''
<|endoftext|>
