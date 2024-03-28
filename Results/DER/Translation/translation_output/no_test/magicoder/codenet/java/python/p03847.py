<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03847 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    long N = sc.nextLong();
    int[] n = new int[61];
    for(int i = 0; i < 61; i++) {
      n[i] = (int)(N % 2);
      N /= 2;
    }
    long[][] dp = new long[61][3];
    if(n[60] == 0) {
      dp[60][0] = 1;
    } else {
      dp[60][0] = 1;
      dp[60][1] = 1; 
    }
    for(int i = 59; i >= 0; i--) {
      dp[i][2] = (3 * dp[i + 1][2]) % MOD;
      for(int j = 0; j < 3; j++) {
        int c = 2 + n[i] - j;
        if(c >= 2) {
          dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD;
        } else {
          dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD;
        }
      }
      for(int j = 0; j < 3; j++) {
        int c = n[i] - j;
        if(c < 0) {
        } else {
          dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD;
        }
      }
    }
    long ans = dp[0][0]; 
    ans = (ans + dp[0][1]) % MOD;
    ans = (ans + dp[0][2]) % MOD;
    System.out.println(ans);
  }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

MOD = pow(10, 9) + 7
N = int(sys.stdin.readline())
n = [0] * 61
for i in range(61):
    n[i] = N % 2
    N //= 2

dp = [[0] * 3 for _ in range(61)]
if n[60] == 0:
    dp[60][0] = 1
else:
    dp[60][0] = 1
    dp[60][1] = 1

for i in range(59, -1, -1):
    dp[i][2] = (3 * dp[i + 1][2]) % MOD
    for j in range(3):
        c = 2 + n[i] - j
        if c >= 2:
            dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
        else:
            dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
    for j in range(3):
        c = n[i] - j
        if c < 0:
            pass
        else:
            dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD

ans = dp[0][0]
ans = (ans + dp[0][1]) % MOD
ans = (ans + dp[0][2]) % MOD
print(ans)
```

Please note that Python does not have a built-in `Scanner` class like Java. Instead, we use `sys.stdin.readline()` to read input from the standard input. Also, Python does not have a built-in `pow` function like Java, so we use the `pow` function from the `math` module.<｜end▁of▁sentence｜>
