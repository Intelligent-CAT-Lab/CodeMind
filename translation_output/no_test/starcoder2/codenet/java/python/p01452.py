
```python
MOD = 1_000_000_000 + 7

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] % MOD * inv(fact[n - k], MOD) % MOD * inv(fact[k], MOD) % MOD

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0

    while b > 1:
        c = b // a
        b = b % a
        q = q - p * c
        d = b
        b = a
        a = d
        d = p
        p = q
        q = d
    while q < 0:
        q += mod
    return q % MOD

n, m, k = map(int, input().split())

fact = [1] * (n + m + 2 * k + 1)
fact[0] = 1
fact[1] = 1
for i in range(1, n + m + 2 * k + 1):
    fact[i] = (i % MOD * fact[i - 1]) % MOD

ans = 0
for i in range(k + 1):
    a = 1
    b = 1
    j = k - i
    if i >= 1:
        a = (nCk(n + 2 * i, i) + MOD - nCk(n + 2 * i, i - 1)) % MOD
    if j >= 1:
        b = (nCk(m + 2 * j, j) + MOD - nCk(m + 2 * j, j - 1)) % MOD
    ans += nCk(n + m + 2 * k, n + 2 * i) % MOD * a % MOD * b % MOD
    ans %= MOD

while ans < 0:
    ans += MOD
print(ans)
```

## 01453

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01453{
    public static void main(String[] args) {
        new p01453().solver();
    }

    static long MOD = 1_000_000_000 + 7;

    void solver() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        fact = new long[n + m + 2 * k + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 1; i <= n + m + 2 * k; i++) {
            fact[i] = (i % MOD * fact[i - 1]) % MOD;
        }
        long ans = 0;
        for (int i = 0; i <= k; i++) {
            long a = 1, b = 1;
            int j = k - i;
            if (i >= 1)
                a = (nCk(n + 2 * i, i) + MOD - nCk(n + 2 * i, i - 1)) % MOD;
            if (j >= 1)
                b = (nCk(m + 2 * j, j) + MOD - nCk(m + 2 * j, j - 1)) % MOD;
            ans += nCk(n + m + 2 * k, n + 2 * i) % MOD * a % MOD * b % MOD;
            ans %= MOD;
        }

        while (ans < 0)
            ans += MOD;
        System.out.println(ans);

    }

    static long[] fact;
    static long[] inv_fact;

    // 1~n?????Â°?????????k????????????????????Â°
    static long nCk(int n, int k) {
        if (n < k)
            return 0;
        else {
            return fact[n] % MOD * inv(fact[n - k], MOD) % MOD * inv(fact[k], MOD) % MOD;
        }
    }

    static long inv(long a, long mod) {
        a = a % mod;
        long b = mod;
        long p = 1, q = 0;

        while (b > 1) {
            long c = b / a;
            b = b % a;
            q = q - p * c;
            long d = b;
            b = a;
            a = d;
            d = p;
            p = q;
            q = d;
        }
        while (q < 0)
            q += mod;
        return q % MOD;
    }

    static void tr(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
}
```

python code:
```python
MOD = 1_000_000_000 + 7

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] % MOD * inv(fact[n - k], MOD) % MOD * inv(fact[k], MOD) % MOD

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0

    while b > 1:
        c = b // a
