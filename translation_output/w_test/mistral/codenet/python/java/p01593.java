<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
0.50000000


```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);
        dp[n] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[i] / (n - i);
            }
        }
        System.out.printf("%.10f%n", dp[n]);
    }
}
```</s>
