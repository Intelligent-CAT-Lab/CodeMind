<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
5


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

python code:<fim_suffix><fim_middle>

```python
import math
MOD = 1000000007

def solve(n):
    n = str(n)
    n = n[::-1]
    n = [int(i) for i in n]
    dp = [[0 for i in range(3)] for j in range(61)]
    if n[0] == 0:
        dp[0][0] = 1
    else:
        dp[0][0] = 1
        dp[0][1] = 1
    for i in range(1, 61):
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
    return ans

if __name__ == '__main__':
    n = int(input())
    print(solve(n))
```
<|endoftext|>
