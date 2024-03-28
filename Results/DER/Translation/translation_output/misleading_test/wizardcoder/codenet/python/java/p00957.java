Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[][] memo = new int[l+1][2];
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < 2; j++) {
                memo[i][j] = -1;
            }
        }

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, k, memo);
        }

        System.out.println(ans);
    }

    public static int rec(int i, int k, int[][] memo) {
        if (i < 0) return 0;
        if (i == 0) return 1;
        if (memo[i][0]!= -1) return memo[i][0];
        if (i == k) return 1;
        if (i < k) {
            memo[i][0] = rec(i-1, k, memo);
            return memo[i][0];
        }
        memo[i][0] = rec(i-1, k, memo) + rec(i-k, k, memo);
        return memo[i][0];
    }
}
```<|endoftext|>
