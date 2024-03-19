<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
4

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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(solve(L,R));
    }
    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % 1000000007;
        return (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % 1000000007;
    }
}
```
'''
<|endoftext|>
