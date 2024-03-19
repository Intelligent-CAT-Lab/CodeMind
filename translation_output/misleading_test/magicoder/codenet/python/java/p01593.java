<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
76.94891250961925

```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        double[] dp = new double[1001];
        dp[1] = 1;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i + 1);
                j++;
            }
        }

        System.out.printf("%.10f", dp[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the standard input, initializes an array `dp` with `1` at the first index and `0` at the rest, and then iterates over the range from `1` to `n`. For each `i`, it iterates over the range from `1` to `m` and adds the value of `dp[i]` divided by `(n - i + 1)` to `dp[i + j]`. Finally, it prints the value of `dp[n]` with 10 decimal places.<｜end▁of▁sentence｜>
