<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int k = in.nextInt();
        int[][] dp = new int[l+1][2];
        dp[0][0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-k][0];
            dp[i][1] = dp[i-1][1] + dp[i-k][1];
        }
        System.out.println(dp[l][0]);
    }
}

```

'''
<|endoftext|>
