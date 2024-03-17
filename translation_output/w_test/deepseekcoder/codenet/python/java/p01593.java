<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[] dp = new double[1001];
        dp[1] = 1.0;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i + 1);
                j++;
            }
        }
        System.out.printf("%.10f\n", dp[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes an array `dp` with size 1001 and the first element as 1.0, and then iterates over the range of `n`. For each `i`, it iterates over the range of `m` and adds the value of `dp[i] / (n - i + 1)` to `dp[i + j]`. Finally, it prints the `n`th element of `dp` with 10 decimal places.
<|EOT|>
