<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-39

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
import java.util.*;

public class Main {
    static int mod = 1000000007;
    static int[][] star = new int[1001][1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
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
        if (star[n][k] != null) {
            return star[n][k] % mod;
        }
        star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
        return star[n][k];
    }
}
```</s>
