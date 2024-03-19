<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int l, k;
    static HashMap<String, Integer> memo = new HashMap<>();

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        String key = i + " " + isBlack;
        if (memo.containsKey(key)) return memo.get(key);
        if (isBlack) {
            int res = rec(i - 1, false) + rec(i - k, false);
            memo.put(key, res);
            return res;
        } else {
            int res = rec(i - 1, true) + rec(i - k, true);
            memo.put(key, res);
            return res;
        }
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

This Java code uses a HashMap to store the results of the recursive function calls, which is similar to the `lru_cache` decorator in Python. The `rec` function is the same as in the Python code, but it has been translated to Java syntax. The main function reads the input values of `l` and `k`, calls the `rec` function for each value from 1 to `l`, and prints the sum of the results.
<|EOT|>
