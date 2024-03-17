<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Java code:

```java
import java.util.*;

public class Main {
    static int l, k;
    static Map<String, Integer> memo = new HashMap<>();

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        String key = i + " " + isBlack;
        if (memo.containsKey(key)) return memo.get(key);
        int ans;
        if (isBlack) {
            ans = rec(i - 1, false) + rec(i - k, false);
        } else {
            ans = rec(i - 1, true);
        }
        memo.put(key, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It uses a HashMap to store previously computed values to avoid redundant calculations. The main difference is that in Java, we need to manually handle the input and output.<｜end▁of▁sentence｜>
