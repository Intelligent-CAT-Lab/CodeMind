System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
3


```
a,b,c,d=map(int,input().split())
mod=998244353
dp=[(d+2)*[0]for _ in range(c+2)]
dp[a][b]=1
for i in range(a,c+1):
    for j in range(b,d+1):
        dp[i][j]%=mod
        dp[i+1][j]+=dp[i][j]*j
        dp[i][j+1]+=dp[i][j]*i
        dp[i+1][j+1]-=dp[i][j]*i*j
print(dp[c][d])

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mod = 998244353;
        int[][] dp = new int[c + 2][d + 2];
        dp[a][b] = 1;
        for (int i = a; i <= c; i++) {
            for (int j = b; j <= d; j++) {
                dp[i][j] %= mod;
                dp[i + 1][j] += dp[i][j] * j;
                dp[i][j + 1] += dp[i][j] * i;
                dp[i + 1][j + 1] -= dp[i][j] * i * j;
            }
        }
        System.out.println(dp[c][d]);
    }
}
```<|endoftext|>
