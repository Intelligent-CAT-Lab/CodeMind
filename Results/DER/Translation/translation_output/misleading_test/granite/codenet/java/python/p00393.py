System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
101

```
import java.util.Scanner;

public class p00393 {
    static final long mod = 1000000007;
    static long dp[][] = new long[100010][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        dp[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            dp[i][0] += dp[i - 1][0] + dp[i - 1][1];
            dp[i][0] %= mod;
            dp[i][1] += dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] %= mod;
            if (i - m >= 0) {
                dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod;
            }
        }

        System.out.println((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod);
    }

    static long pow2(int k) {
        //v = 2^n mod 1e9+7
        long v = 1L;
        for (int i = 0; i < k; i++) {
            v *= 2L;
            v %= mod;
        }
        return v;
    }
}


```


Answer:
```python
import sys

mod = 1000000007
dp = [[0, 0] for _ in range(100010)]

def pow2(k):
    #v = 2^n mod 1e9+7
    v = 1
    for i in range(k):
        v *= 2
        v %= mod
    return v

def main():
    n, m = map(int, sys.stdin.readline().split())

    dp[0][0] = 1
    for i in range(1, n + 1):
        dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][0] %= mod
        dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
        dp[i][1] %= mod
        if i - m >= 0:
            dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

    print((pow2(n) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)

if __name__ == "__main__":
    main()
```<|endoftext|>
