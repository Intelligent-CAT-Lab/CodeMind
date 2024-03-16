<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from functools import *
MOD=10**9+7
@lru_cache(maxsize=None)
def solve(L,R):
  if L > R: return 0
  if L == 1: return (1 + solve(2, R)) % MOD
  return (solve(L//2,(R-1)//2) + solve((L+1)//2,R//2) + solve((L+1)//2,(R-1)//2)) % MOD
  
print(solve(*map(int,input().split())))
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static long MOD = (long)Math.pow(10,9)+7;
    static Map<String, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(solve(L, R));
    }

    static long solve(int L, int R) {
        if (L > R) return 0;
        String key = L + " " + R;
        if (memo.containsKey(key)) return memo.get(key);
        if (L == 1) {
            memo.put(key, (1 + solve(2, R)) % MOD);
        } else {
            memo.put(key, (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % MOD);
        }
        return memo.get(key);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calls the `solve` function with these integers, and prints the result. The `solve` function uses memoization to avoid redundant calculations.
<|EOT|>
