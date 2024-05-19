System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n, a, b, c = [int(i) for i in input().split()]
p = 10 ** 9 + 7

ans = 0

def fact(n, p=10**9 + 7):
    f = [1]
    for i in range(1, n+1):
        f.append(f[-1]*i%p)
    return f

def invfact(n, f, p=10**9 + 7):
    inv = [pow(f[n], p-2, p)]
    for i in range(n, 0, -1):
        inv.append(inv[-1]*i%p)
    return inv[::-1]

f = fact(2 * n)
invf = invfact(2 * n, f)

def comb(a, b):
    if a < b:
        return 0
    if a < 0 or b < 0:
        return 0
    return f[a] * invf[b] * invf[a-b] % p

pow_a = [1]
pow_b = [1]
inv_100 = pow(100, p - 2, p)
a = a * inv_100 % p
b = b * inv_100 % p
c = c * inv_100 % p

inv_ab = pow(a + b, p - 2, p)
a = a * inv_ab % p
b = b * inv_ab % p

for i in range(n):
    pow_a.append(pow_a[-1] * a % p)
    pow_b.append(pow_b[-1] * b % p)

for m in range(n, 2 * n):
    ans += comb(m - 1, n - 1) * (pow_a[n] * pow_b[m - n] + pow_a[m - n] * pow_b[n]) * m
    ans %= p

ans *= pow(1 - c, p - 2, p)

print(ans % p)
```


Answer:
```java
import java.util.*;

public class Main {
    static int MOD = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long[] fact = new long[2 * n + 1];
        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long[] invFact = new long[2 * n + 1];
        invFact[2 * n] = pow(fact[2 * n], MOD - 2);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        long ans = 0;
        long inv100 = pow(100, MOD - 2);
        long inv_ab = pow(a + b, MOD - 2);
        a = a * inv100 % MOD;
        b = b * inv100 % MOD;
        c = c * inv100 % MOD;
        a = a * inv_ab % MOD;
        b = b * inv_ab % MOD;

        long[] powA = new long[n + 1];
        long[] powB = new long[n + 1];
        powA[0] = powB[0] = 1;
        for (int i = 1; i <= n; i++) {
            powA[i] = powA[i - 1] * a % MOD;
            powB[i] = powB[i - 1] * b % MOD;
        }

        for (int m = n; m < 2 * n; m++) {
            ans += comb(m - 1, n - 1, fact, invFact) * (powA[n] * powB[m - n] + powA[m - n] * powB[n]) % MOD * m;
            ans %= MOD;
        }

        ans = ans * pow(1 - c, MOD - 2) % MOD;
        System.out.println(ans);
    }

    static long comb(int n, int r, long[] fact, long[] invFact) {
        if (n < r) return 0;
        if (n < 0 || r < 0) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    static long pow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            n /= 2;
        }
        return res;
    }
}
```<|endoftext|>
