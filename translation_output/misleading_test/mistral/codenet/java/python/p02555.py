<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
92

```
import java.util.*;

public class p02555 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 3; j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}

```
[/INST]
```python
n = int(input())
mod = 1000000007
dp = [0] * (n+1)
dp[0] = 1
for i in range(3, n+1):
    for j in range(3, i+1):
        dp[i] = (dp[i] + dp[i-j]) % mod
print(dp[n])
```</s>
