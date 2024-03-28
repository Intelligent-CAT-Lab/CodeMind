<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 25 25 50

Expected output:
-62

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long p = 1000000007;

        List<Long> fact = new ArrayList<>();
        fact.add(1L);
        for (int i = 1; i <= n; i++) {
            fact.add(fact.get(fact.size() - 1) * i % p);
        }

        List<Long> invFact = new ArrayList<>();
        invFact.add(pow(fact.get(n), p - 2, p));
        for (int i = n - 1; i >= 0; i--) {
            invFact.add(invFact.get(invFact.size() - 1) * i % p);
        }

        List<Long> f = new ArrayList<>();
        f.add(fact.get(2 * n));
        List<Long> invF = new ArrayList<>();
        invF.add(invFact.get(2 * n));

        long comb = 0;
        for (int i = 1; i <= n; i++) {
            comb += fact.get(i) * invF.get(n - i) * invF.get(n - i - 1) % p;
        }

        long powA = 1;
        long powB = 1;
        long inv100 = pow(100, p - 2, p);
        a %= inv100;
        b %= inv100;
        c %= inv100;

        long invAB = pow(a + b, p - 2, p);
        a %= invAB;
        b %= invAB;

        for (int i = 1; i <= n; i++) {
            powA *= a % p;
            powB *= b % p;
        }

        for (int m = 1; m <= 2 * n; m++) {
            comb += fact.get(m - 1) * invF.get(n - 1) * invF.get(m - n) % p;
            comb *= (powA * powB + powB * powA) * m % p;
        }

        comb *= pow(1 - c, p - 2, p);

        System.out.println(comb % p);
    }

    private static long pow(long x, long y, long mod) {
        long res = 1;
        while (y != 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y /= 2;
            x = (x * x) % mod;
        }
        return res;
    }
}
```</s>
