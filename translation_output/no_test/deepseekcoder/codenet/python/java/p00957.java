<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    static int l, k;
    static long[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        memo = new long[l+1][2];
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < 2; j++) {
                memo[i][j] = -1;
            }
        }
        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, 1);
        }
        System.out.println(ans);
    }

    static long rec(int i, int isBlack) {
        if (i < 1) {
            return 0;
        }
        if (memo[i][isBlack] != -1) {
            return memo[i][isBlack];
        }
        if (isBlack == 1) { // top is black
            memo[i][isBlack] = rec(i-1, 0) + rec(i-k, 0);
        } else {  // top is white
            memo[i][isBlack] = rec(i-1, 1) + rec(i-k, 1);
        }
        return memo[i][isBlack];
    }
}
```

This Java code does the same thing as the Python code. It uses memoization to avoid redundant calculations. The `rec` function is a recursive function that calculates the number of ways to arrange the tiles. The `main` function reads the input, initializes the memoization array, and calculates the answer.
<|EOT|>
