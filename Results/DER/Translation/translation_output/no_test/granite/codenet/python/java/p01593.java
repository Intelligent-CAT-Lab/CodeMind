System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] dp = new double[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m && i+j <= n; j++) {
                dp[i+j] += dp[i] / (n-i);
            }
        }
        System.out.println(String.format("%.10f", dp[n]));
    }
}
```

In this Java code, we first initialize the `dp` array with all elements set to 0. Then, we use nested loops to calculate the values of `dp` based on the given formula. Finally, we print the value of `dp[n]` with 10 decimal places using the `String.format()` method.<|endoftext|>
