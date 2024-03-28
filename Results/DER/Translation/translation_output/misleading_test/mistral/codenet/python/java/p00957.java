<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-78

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }
        System.out.println(ans);
    }

    @SuppressWarnings("unused")
    private static int rec(int i, boolean isBlack) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return isBlack ? 1 : 0;
        }
        if (isBlack) {
            return rec(i - 1, false) + rec(i - k, false);
        } else {
            return rec(i - 1, true) + rec(i - k, true);
        }
    }
}
```</s>
