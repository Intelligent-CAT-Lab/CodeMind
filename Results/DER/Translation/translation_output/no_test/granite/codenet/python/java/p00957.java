System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        long[][] dp = new long[l+1][2];
        dp[0][0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + (i >= k? dp[i-k][0] : 0);
        }
        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += dp[i][0];
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
