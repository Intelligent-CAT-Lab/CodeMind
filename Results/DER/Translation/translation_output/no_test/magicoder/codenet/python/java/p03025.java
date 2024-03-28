<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    static long p = 1000000007;
    static long[] fact, invfact;
    static long[] pow_a, pow_b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        fact = new long[2 * n + 1];
        invfact = new long[2 * n + 1];
        pow_a = new long[n + 1];
        pow_b = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = (fact[i - 1] * i) % p;
        }

        invfact[2 * n] = pow(fact[2 * n], p - 2, p);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invfact[i] = (invfact[i + 1] * (i + 1)) % p;
        }

        a = (a * pow(100, p - 2, p)) % p;
        b = (b * pow(100, p - 2, p)) % p;
        c = (c * pow(100, p - 2, p)) % p;

        long inv_ab = pow(a + b, p - 2, p);
        a = (a * inv_ab) % p;
        b = (b * inv_ab) % p;

        pow_a[0] = 1;
        pow_b[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow_a[i] = (pow_a[i - 1] * a) % p;
            pow_b[i] = (pow_b[i - 1] * b) % p;
        }

        long ans = 0;
        for (int m = n; m <= 2 * n; m++) {
            ans = (ans + comb(m - 1, n - 1) * (pow_a[n] * pow_b[m - n] + pow_a[m - n] * pow_b[n]) * m) % p;
        }

        ans = (ans * pow(1 - c, p - 2, p)) % p;

        System.out.println(ans);
    }

    static long pow(long a, long b, long p) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            b >>= 1;
        }
        return res;
    }

    static long comb(int a, int b) {
        if (a < b) {
            return 0;
        }
        if (a < 0 || b < 0) {
            return 0;
        }
        return (fact[a] * invfact[b] % p * invfact[a - b] % p) % p;
    }
}
```

This Java code does the same thing as the Python code. It reads input, calculates factorials and inverse factorials, and then calculates the answer. The `pow` function is used to calculate the power of a number modulo a prime number, and the `comb` function is used to calculate combinations modulo a prime number.<｜end▁of▁sentence｜>
