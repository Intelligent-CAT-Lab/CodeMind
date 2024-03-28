<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
59

```
a,b,c,d=map(int,input().split())
mod=998244353
dp=[(d+2)*[0]for _ in range(c+2)]
dp[a][b]=1
for i in range(a,c+1):
    for j in range(b,d+1):
        dp[i][j]%=mod
        dp[i+1][j]+=dp[i][j]*j
        dp[i][j+1]+=dp[i][j]*i
        dp[i+1][j+1]-=dp[i][j]*i*j
print(dp[c][d])

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long mod = 998244353;
        long[][] dp = new long[c+2][d+2];
        dp[a][b] = 1;
        for (int i = a; i <= c; i++) {
            for (int j = b; j <= d; j++) {
                dp[i][j] %= mod;
                dp[i+1][j] += dp[i][j]*j;
                dp[i][j+1] += dp[i][j]*i;
                dp[i+1][j+1] -= dp[i][j]*i*j;
            }
        }
        System.out.println(dp[c][d]);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, initializes a 2D array `dp` with the size of `(c+2) x (d+2)`, and sets `dp[a][b]` to 1. Then it iterates over the array and updates the values according to the rules of the problem. Finally, it prints the value of `dp[c][d]`.
<|EOT|>
