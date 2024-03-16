<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Integer> memo = new HashMap<>();

        int ans = rec(0, true, l, k, memo);
        System.out.println(ans);
    }

    public static int rec(int i, boolean isBlack, int l, int k, Map<Integer, Integer> memo) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return isBlack ? 1 : 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int ans = 0;
        if (isBlack) {
            ans = rec(i - 1, false, l, k, memo) + rec(i - k, false, l, k, memo);
        } else {
            ans = rec(i - 1, true, l, k, memo) + rec(i - k, true, l, k, memo);
        }
        memo.put(i, ans);
        return ans;
    }
}
```</s>
