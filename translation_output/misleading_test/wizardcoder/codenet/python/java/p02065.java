Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int)1e9 + 7;
        int[][] dp = new int[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                if (dp[i][j] == -1) {
                    continue;
                }
                if (j == 0) {
                    for (int k = 1; k <= K; k++) {
                        if (i+k >= 2*N) {
                            break;
                        }
                        dp[i+k][0] = (dp[i+k][0] + dp[i][j]) % mod;
                    }
                } else {
                    for (int k = 1; k <= K; k++) {
                        if (i+k >= 2*N) {
                            break;
                        }
                        if (j-k >= 0) {
                            dp[i+k][j-k] = (dp[i+k][j-k] + dp[i][j]) % mod;
                        }
                        if (j+k < 2*N) {
                            dp[i+k][j+k] = (dp[i+k][j+k] + dp[i][j]) % mod;
                        }
                    }
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
```<|endoftext|>
