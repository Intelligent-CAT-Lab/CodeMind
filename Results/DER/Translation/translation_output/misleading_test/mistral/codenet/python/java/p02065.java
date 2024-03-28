<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2 7

Expected output:
60

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        int[][] dp = new int[2 * N][2 * N];
        Arrays.fill(dp, new int[2 * N]);
        Arrays.fill(dp[0], new int[2 * N]);
        dp[0][(0, 0)] = 1;
        for (int i = 1; i < 2 * N - 1; i++) {
            for (Map.Entry<int[][], Integer> entry : dp[i].entrySet()) {
                int[] leftTop = entry.getKey();
                int v = entry.getValue();
                if (leftTop[1].length > K + 1) {
                    continue;
                }
                if (leftTop[0] == null) {
                    if (leftTop[1] != null && i + 1 - leftTop[1] <= K) {
                        dp[i + 1][(i + 1, leftTop[1])] = (dp[i + 1][(i + 1, leftTop[1])] + v) % mod;
                    }
                } else {
                    if (i + 1 - leftTop[0] <= K) {
                        dp[i + 1][(leftTop[0], leftTop[1])] = (dp[i + 1][(leftTop[0], leftTop[1])] + v) % mod;
                    }
                    if (leftTop[1].length > 1 && i + 1 - leftTop[1] <= K) {
                        dp[i + 1][(leftTop[0], leftTop[1])] = (dp[i + 1][(leftTop[0], leftTop[1])] + v) % mod;
                    }
                }
            }
        }
        int res = 0;
        for (Map.Entry<int[][], Integer> entry : dp[2 * N - 1].entrySet()) {
            int[] leftTop = entry.getKey();
            int v = entry.getValue();
            if (leftTop[1].length == 1) {
                assert leftTop[0] == 2 * N - 1;
                res = (res + v) % mod;
            }
        }
        System.out.println(res);
    }
}
```</s>
