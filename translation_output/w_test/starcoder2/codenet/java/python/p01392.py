

```python
import math

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

A, B = map(int, input().split())
L = max(A - B, 2)
H = A + B
primes = primes(int(math.sqrt(H) + 1))
count = [0] * (H - L + 1)
ok = [True] * (H - L + 1)
for i in range(len(primes) - 1, -1, -1):
    p = primes[i]
    div = (L + (p - 1)) // p
    for pos in range(div * p, H + 1, p):
        cc = 1
        v = div
        while v % p == 0:
            cc += 1
            v //= p
        if count[pos - L] > cc:
            ok[pos - L] = False
        count[pos - L] = cc

ret = 0
for i in range(len(ok)):
    if ok[i]:
        ret += 1
print(ret)
```

## 1393. 最大数

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.util.Scanner;

public class p01393 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; ++i) {
            for (int j = 0; j < K; ++j) {
                if (i - j - 1 >= 0) {
                    dp[i] += dp[i - j - 1];
                }
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:

```python
N, K = map(int, input().split())
dp = [0] * (N + 1)
dp[0] = 1
for i in range(1, N + 1):
    for j in range(K):
        if i - j - 1 >= 0:
            dp[i] += dp[i - j - 1]
print(dp[N])
```

## 1394. 最大数

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.util.Scanner;

public class p01394 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; ++i) {
            for (int j = 0; j < K; ++j) {
                if (i - j - 1 >= 0) {
                    dp[i] += dp[i - j - 1];
                }
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:

```python
N, K = map(int, input().split())
dp = [0] * (N + 1)
dp[0] = 1
for i in range(1, N + 1):
    for j in range(K):
        if i - j - 1 >= 0:
            dp[i] += dp[i - j - 1]
print(dp[N])
```

## 1395. 最大数

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.util.Scanner;

public class p01395 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; ++i) {
            for (int j = 0; j < K; ++j) {
                if (i - j - 1 >= 0) {
                    dp[i] += dp[i - j - 1];
                }
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:

```python
N, K = map(int, input().split())
dp = [0] * (N + 1)
dp[0] = 1
for i in range(1, N + 1):
    for j in range(K):
        if i - j - 1 >= 0:
            dp[i] += dp[i - j - 1]
print(dp[
