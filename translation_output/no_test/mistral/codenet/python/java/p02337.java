<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Arrays;

public class Main {
    static int mod = 1000000007;
    static int[][] star = new int[1001][1001];

    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            Arrays.fill(star[i], 0);
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 1;
        }

        int n = Integer.parseInt(input().split(" ")[0]);
        int k = Integer.parseInt(input().split(" ")[1]);

        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }

        System.out.println(ans);
    }

    public static int search(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (star[n][k] != 0) {
            return star[n][k] % mod;
        }
        star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
        return star[n][k];
    }
}
```</s>
