<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
5


```
import sys
sys.setrecursionlimit(10**7)

mod = 10**9 + 7

star = [[None] * 1001 for _ in range(1001)]
for i in range(1001):
    star[i][1] = 1
    star[i][i] = 1
    star[i][0] = 0

def search(n, k):
    if n < k:
        return 0
    elif star[n][k]!= None:
        return star[n][k] % mod
    else:
        star[n][k] = (search(n-1, k-1) + k * search(n-1, k)) % mod
        return star[n][k]

n, k = map(int, input().split())
ans = 0
for i in range(k+1):
    ans += search(n, i)
    ans = ans % mod

print(ans)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[n+1][k+1];
        for(int i = 1; i <= n; i++) {
            dp[i][1] = 1;
            dp[i][i] = 1;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i-1][j-1] + j * dp[i-1][j]) % 1000000007;
            }
        }
        int ans = 0;
        for(int i = 0; i <= k; i++) {
            ans = (ans + dp[n][i]) % 1000000007;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
