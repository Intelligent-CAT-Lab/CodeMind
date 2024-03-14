Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

MOD = int(math.pow(10, 9) + 7)

def count(n):
    count = 0
    while n > 0:
        count += n % 2
        n //= 2
    return count

def dp(n):
    dp = [[0 for _ in range(3)] for _ in range(61)]
    if n == 0:
        dp[60][0] = 1
    else:
        dp[60][0] = 1
        dp[60][1] = 1
    for i in range(59, -1, -1):
        dp[i][2] = (3 * dp[i + 1][2]) % MOD
        for j in range(3):
            c = 2 + count(n) - j
            if c >= 2:
                dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
        for j in range(3):
            c = count(n) - j
            if c < 0:
                pass
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
    return dp[0][0]

n = int(input())
print(dp(n))
```<|endoftext|>
