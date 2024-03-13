<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[] dp = new double[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.printf("%.10f", dp[n]);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers `n` and `m` from the standard input, initializes an array `dp` with `dp[0]` set to 1 and the rest set to 0, and then iterates over the range from 0 to `n`. For each `i`, it iterates over the range from 1 to `m` and adds the value of `dp[i]` divided by `(n - i)` to `dp[i + j]`. Finally, it prints the value of `dp[n]` with 10 decimal places.<｜end▁of▁sentence｜>
