<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter
N, K, mod = map(int, input().split())
dp = [Counter() for _ in range(2*N)]

dp[0][(None, (0,))] = 1
for i in range(2*N-1):
    for (left, top), v in dp[i].items():
        if len(top) > K+1:
            continue
        if left == None:
            if top and i+1 - top[0] <= K:
                dp[i+1][(i+1, top)] = (dp[i+1][(i+1, top)] + v) % mod 
        elif (i+1 - left <= K) and len(top) > 1 and (i+1 - top[1] <= K):
            dp[i+1][(i+1, top[1:])] = (dp[i+1][(i+1, top[1:])] + v) % mod
        if top and (i+1 - top[-1] <= K):
            top = list(top)
            top.append(i+1)
            top = tuple(top)
            dp[i+1][(left, top)] = (dp[i+1][(left, top)] + v) % mod

res = 0
for (left, top), v in dp[2*N-1].items():
    if len(top) == 1:
        assert left == 2*N - 1
        res = (res + v) % mod
print(res)


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int mod = (int)1e9 + 7;
        int[][] dp = new int[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            Arrays.fill(dp[i], 0);
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                for (int k = 0; k < 2*N; k++) {
                    if (j - k > K) continue;
                    dp[i+1][j+k] = (dp[i+1][j+k] + dp[i][j]) % mod;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 2*N; i++) {
            res = (res + dp[2*N-1][i]) % mod;
        }
        System.out.println(res);
    }
}
```
<|endoftext|>
