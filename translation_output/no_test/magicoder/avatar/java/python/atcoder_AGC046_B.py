<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        final long MOD = 998244353;
        long[][] dp = new long[D][C];
        long[][] sum = new long[D][C];
        
        sum[B - 1][A - 1] = 1;
        
        for (int i = A; i < C; i++) {
            sum[B - 1][i] = (sum[B - 1][i - 1] * B) % MOD;
        }
        
        for (int i = B; i < D; i++) {
            for (int j = A; j < C; j++) {
                dp[i][j] = dp[i - 1][j] * j;
                dp[i][j] += sum[i - 1][j - 1] * j;
                dp[i][j] %= MOD;
                sum[i][j] = (sum[i][j - 1] * (i + 1) + dp[i][j]) % MOD;
            }
        }
        
        long ans = 0;
        long powC = 1;
        
        for (int i = D - 1; i >= B; i--) {
            long powI = 1;
            
            for (int j = C - 1; j >= A; j--) {
                ans = (ans + dp[i][j] * ((powC * powI) % MOD)) % MOD;
                powI = (powI * (i + 1)) % MOD;
            }
            
            powC = (powC * C) % MOD;
        }
        
        ans = (ans + (powC * sum[B - 1][C - 1]) % MOD) % MOD;
        
        System.out.println(ans);
        sc.close();
    }
}
```

@@ Response
```python
import sys

MOD = 998244353

def main():
    A, B, C, D = map(int, sys.stdin.readline().split())
    dp = [[0] * C for _ in range(D)]
    sum = [[0] * C for _ in range(D)]

    sum[B - 1][A - 1] = 1

    for i in range(A, C):
        sum[B - 1][i] = (sum[B - 1][i - 1] * B) % MOD

    for i in range(B, D):
        for j in range(A, C):
            dp[i][j] = dp[i - 1][j] * j
            dp[i][j] += sum[i - 1][j - 1] * j
            dp[i][j] %= MOD
            sum[i][j] = (sum[i][j - 1] * (i + 1) + dp[i][j]) % MOD

    ans = 0
    powC = 1

    for i in range(D - 1, B - 1, -1):
        powI = 1

        for j in range(C - 1, A - 1, -1):
            ans = (ans + dp[i][j] * ((powC * powI) % MOD)) % MOD
            powI = (powI * (i + 1)) % MOD

        powC = (powC * C) % MOD

    ans = (ans + (powC * sum[B - 1][C - 1]) % MOD) % MOD

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers A, B, C, and D from the standard input, and then calculates the result according to the given formula. The result is then printed to the standard output.<｜end▁of▁sentence｜>
