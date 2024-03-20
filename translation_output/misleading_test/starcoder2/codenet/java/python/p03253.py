

```python
MOD = 1000000007
def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul *= (n - i)
        ansDiv *= (i + 1)
        ansMul %= MOD
        ansDiv %= MOD
    ans = ansMul * pow(ansDiv, MOD - 2)
    ans %= MOD
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if (n & 1) == 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

n, m = map(int, input().split())
res = m
ans = 1
for i in range(2, int(res ** 0.5) + 1):
    cnt = 0
    while res % i == 0:
        cnt += 1
        res //= i
    ans *= calcComb(cnt + n - 1, n - 1)
    ans %= MOD
if res != 1:
    ans *= calcComb(n, 1)
    ans %= MOD
print(ans)
```

## 03254

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;
public class p03254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, n / i);
            }
        }
        System.out.println(ans);
    }
}
```

python code:

```python
n = int(input())
ans = 0
for i in range(1, int(n ** 0.5) + 1):
    if n % i == 0:
        ans = max(ans, i)
        ans = max(ans, n // i)
print(ans)
```

## 03255

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10
1 2 1
1 3 1
1 4 1
1 5 1
1 6 1
1 7 1
1 8 1
1 9 1
1 10 1
2 3 1
2 4 1
2 5 1
2 6 1
2 7 1
2 8 1
2 9 1
2 10 1
3 4 1
3 5 1
3 6 1
3 7 1
3 8 1
3 9 1
3 10 1
4 5 1
4 6 1
4 7 1
4 8 1
4 9 1
4 10 1
5 6 1
5 7 1
5 8 1
5 9 1
5 10 1
6 7 1
6 8 1
6 9 1
6 10 1
7 8 1
7 9 1
7 10 1
8 9 1
8 10 1
9 10 1

Expected output:
10

```
import java.util.*;
public class p03255 {
    static int N = 100000;
    static int INF = 1000000000;
    static int[] dist = new int[N];
    static boolean[] used = new boolean[N];
    static int[] cost = new int[N];
    static int[] prev = new int[N];
    static int[] next = new int[N];
    static int[] head = new int[N];
    static int[] to = new int[N * 2];
    static int[] from = new int[N * 2];
    static int[] w = new int[N * 2];
    static int[] id = new int[N * 2];
    static int[] last = new int[N];
    static int[] q = new int[N];
    static int[] q2 = new int[N];
    static int[] q3 = new int[N];
    static int[] q4 = new int[N];
    static int[] q5 = new int[N];
    static int[] q6 = new int[N];
    static int[] q7 = new int[N];
    static int[] q8 = new int[N];
    static int[] q9 = new int[N];
    static int[] q10 = new int[N];
    static int[] q11 = new int[N];
    static int[] q12 = new int[N];
    static int[] q13 = new int[N];
    static int[] q14 = new int[N];
    static int[] q15 = new int[N];
    static int[] q16 = new int[N];
    static int[] q17 = new int[N];
    static int[] q18 = new int[N];
    static int[] q19 = new int[N];
    static int[] q20 = new int[N];
    static int[] q21 = new int[N];
    static int[] q22 = new int[N];
    static int[] q23 = new int[N];
    static int[] q24 = new int[N];
    static int[] q25 = new int[N];
    static int[] q26 = new int[N];
    static int[] q27 = new int[N];
    static int[] q28 = new int[N];
    static int[] q29 = new int[N];
    static int[] q30 = new int[N];
    static int[] q31 = new int[N];
    static int[] q32 = new int[N];
    static int[] q33 = new int[N];
    static int[] q34 = new int[N];
    static int[] q35 = new int[N];
    static int[] q36 = new int[N];
    static int
