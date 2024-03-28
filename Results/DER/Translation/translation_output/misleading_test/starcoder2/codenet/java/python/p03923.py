
```python
import math

def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        # min ( k1 + k2 + ... ki + a*(i-1) )
        # k1*k2*k3*...*ki>=n
        t = a * (i - 1)
        maxK = f(i, n)
        curK = 1
        for j in range(i):
            if curK * pow(maxK - 1, i - j) / pow(maxK - 1, i - j) == curK and curK * pow(maxK - 1, i - j) < n:
                t += maxK
                if curK != curK * maxK / maxK:
                    curK = n
                else:
                    curK *= maxK
            else:
                t += maxK - 1
                if curK != curK * (maxK - 1) / (maxK - 1):
                    curK = n
                else:
                    curK *= maxK - 1
        ans = min(ans, t)
    return ans

def f(i, n):
    ok = n
    ng = 0
    while ok - ng > 1:
        middle = (ok + ng) // 2
        v = 1
        for k in range(i):
            if v != v * middle / middle:
                ok = middle
                continue
            v *= middle
        if v >= n:
            ok = middle
        else:
            ng = middle
    return ok

def pow(a, n):
    ret = 1
    for i in range(n):
        ret *= a
    return ret

def solver2(n, a):
    dp = [math.inf] * (2 * n)
    dp[0] = 0
    for i in range(n):
        if i != 0:
            for j in range(i, 2 * n, i):
                dp[j] = min(dp[j], dp[i] + a + j // i)
        else:
            for j in range(1, 2 * n):
                dp[j] = j
    ans = math.inf
    for i in range(n, 2 * n):
        ans = min(ans, dp[i])
    return ans

def tr(*objects):
    print(*objects)

n, a = map(int, input().split())
print(solver(n, a))
```

## 03924

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class p03924 {
    public static void main(String[] args) {
        new p03924().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solver(n, m));
    }

    int solver(int n, int m) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE >> 3);
        dp[0] = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (i + j <= n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }
        }
        return dp[n];
    }

    void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }
}
```

python code:
```python
import math

def solver(n, m):
    dp = [math.inf] * (n + 1)
    dp[0] = 0
    for i in range(n):
        for j in range(1, m + 1):
            if i + j <= n:
                dp[i + j] = min(dp[i + j], dp[i] + 1)
    return dp[n]

def tr(*objects):
    print
