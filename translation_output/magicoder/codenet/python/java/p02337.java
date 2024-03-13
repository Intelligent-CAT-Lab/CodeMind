<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
sys.setrecursionlimit(10**7)

mod = 10**9 + 7

star = [[None] * 1001 for _ in range(1001)]
for i in range(1001):
    star[i][1] = 1
    star[i][i] = 1
    star[i][0] = 0

def search(n, k):
    if n < k:
        return 0
    elif star[n][k] != None:
        return star[n][k] % mod
    else:
        star[n][k] = (search(n-1, k-1) + k * search(n-1, k)) % mod
        return star[n][k]

n, k = map(int, input().split())
ans = 0
for i in range(k+1):
    ans += search(n, i)
    ans = ans % mod

print(ans)

```

@@ Response
```java
import java.util.*;

public class Main {
    static long mod = (long) Math.pow(10, 9) + 7;
    static long[][] star = new long[1001][1001];

    static void init() {
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
    }

    static long search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
            return star[n][k];
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}
```

Please note that Java does not support list comprehension like Python does. So, we have to initialize the 2D array `star` in the `init` method. Also, Java does not have a built-in `map` function like Python does, so we use `Scanner` to read the input.<｜end▁of▁sentence｜>
