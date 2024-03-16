<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int[] dp = new int[]{1};
        Arrays.fill(dp, 0, 1000, 0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.printf("%.10f%n", dp[n]);
    }
}
```</s>
