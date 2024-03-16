<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
import java.lang.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int k = in.nextInt();
        System.out.println(new Main().solve(l, k));
    }

    public int solve(int l, int k) {
        int[] dp = new int[l + 1];
        dp[0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i] = dp[i - 1] + dp[i - k];
        }
        return Arrays.stream(dp).sum();
    }
}
```

'''
<|endoftext|>
