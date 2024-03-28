Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
6


```
from functools import lru_cache  # ãã¾ããªã

l,k=map(int,input().split())

@lru_cache()     # python ç´ æ´ããã
def rec(i,isBlack):
    if i < 0: return 0
    if i == 0: return 1 if not isBlack else 0  # black at bottom
    if isBlack: # top is black
        return rec(i-1, False) + rec(i-k, False)
    else:  # top is white
        return rec(i-1, True)

ans = sum ( rec(i,True) for i in range(1, l+1))
    
print(ans)


```

### Response:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[][] dp = new int[l+1][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for (int i = 1; i <= l; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-k][0];
            dp[i][1] = dp[i-1][1] + dp[i-k][1];
        }

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += dp[i][0];
        }

        System.out.println(ans);
    }
}
```

Explanation:

We use a 2D array `dp` to store the number of ways to reach each position `i` with `i` black and `i` white stones. We initialize the first row with `dp[0][0] = 1` and `dp[0][1] = 0` since there is only one way to reach the first position with no stones.

For each position `i`, we calculate the number of ways to reach it with `i` black and `i` white stones using the recurrence relation `dp[i][0] = dp[i-1][0] + dp[i-k][0]` and `dp[i][1] = dp[i-1][1] + dp[i-k][1]`.

Finally, we sum up all the `dp[i][0]` values to get the total number of ways to reach the last position with `l` black stones.<|endoftext|>
