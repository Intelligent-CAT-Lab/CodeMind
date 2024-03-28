Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3


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
```java
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        int MOD = 1000000007;
        BiFunction<Integer, Integer, Integer> solve = new BiFunction<Integer, Integer, Integer>() {
            public Integer apply(Integer L, Integer R) {
                if (L > R) return 0;
                if (L == 1) return (1 + apply(2, R)) % MOD;
                return (apply(L/2, (R-1)/2) + apply((L+1)/2, R/2) + apply((L+1)/2, (R-1)/2)) % MOD;
            }
        };
        System.out.println(solve.apply(L, R));
    }
}
```<|endoftext|>
