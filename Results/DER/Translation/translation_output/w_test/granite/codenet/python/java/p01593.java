System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
Here's the Java code for the given Python code:

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
                dp[i+j] += dp[i]/(n-i);
            }
        }
        System.out.println(String.format("%.10f", dp[n]));
    }
}
```

You can test the code with the following test case:

```
2 1
```

Expected Output:
```
0.5000000000
``` <|endoftext|>
