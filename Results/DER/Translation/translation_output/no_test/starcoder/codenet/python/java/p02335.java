<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = (int) Math.pow(10,9)+7;
        int[][] dp = new int[n+1][k+1];
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                dp[i][j] = dp[i-1][j];
                if(j >= i) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j-i]) % MOD;
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
```
<|endoftext|>
