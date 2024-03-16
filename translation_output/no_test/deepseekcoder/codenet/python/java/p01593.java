<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
dp=[1]+[0]*1000
n,m=map(int,input().split())
for i in range(n):
    j=1
    while i+j<=n and j<=m:dp[i+j]+=dp[i]/(n-i);j+=1
print('%.10f'%dp[n])
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] dp = new double[1001];
        dp[0] = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
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

This Java code does the same thing as your Python code. It initializes an array `dp` with size 1001 and sets the first element to 1. Then it reads two integers `n` and `m` from the input. It then iterates over the range from 0 to `n`. For each `i`, it iterates over the range from 1 to `m` and adds `dp[i] / (n - i)` to `dp[i + j]`. Finally, it prints the `n`-th element of `dp` with 10 decimal places.
<|EOT|>
