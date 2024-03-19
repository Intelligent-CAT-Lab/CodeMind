<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    static final int p = (int) Math.pow(10, 9) + 7;
    static int n, a, b, c;
    static long[] f, invf;
    static long[] pow_a, pow_b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        f = new long[2 * n + 1];
        invf = new long[2 * n + 1];
        pow_a = new long[n + 1];
        pow_b = new long[2 * n + 1];

        fact();
        invfact();
        precompute();

        long ans = 0;
        for (int m = n; m < 2 * n; m++) {
            ans += comb(m - 1, n - 1) * (pow_a[n] * pow_b[m - n] + pow_a[m - n] * pow_b[n]) * m;
            ans %= p;
        }

        ans *= pow(1 - c, p - 2);
        ans %= p;

        System.out.println(ans);
    }

    static void fact() {
        f[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            f[i] = (f[i - 1] * i) % p;
        }
    }

    static void invfact() {
        invf[2 * n] = pow(f[2 * n], p - 2);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invf[i] = (invf[i + 1] * (i + 1)) % p;
        }
    }

    static void precompute() {
        long inv_100 = pow(100, p - 2);
        a = (int) ((a * inv_100) % p);
        b = (int) ((b * inv_100) % p);
        c = (int) ((c * inv_100) % p);

        long inv_ab = pow(a + b, p - 2);
        a = (int) ((a * inv_ab) % p);
        b = (int) ((b * inv_ab) % p);

        pow_a[0] = 1;
        pow_b[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow_a[i] = (pow_a[i - 1] * a) % p;
            pow_b[i] = (pow_b[i - 1] * b) % p;
        }
        for (int i = n + 1; i <= 2 * n; i++) {
            pow_b[i] = (pow_b[i - 1] * b) % p;
        }
    }

    static long comb(int a, int b) {
        if (a < b) {
            return 0;
        }
        if (a < 0 || b < 0) {
            return 0;
        }
        return (f[a] * invf[b] * invf[a - b]) % p;
    }

    static long pow(long x, int n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % p;
            }
            x = (x * x) % p;
            n >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the factorial and inverse factorial, precomputes the powers of `a` and `b`, and then calculates the answer. The `pow` function is used to calculate the modular exponentiation. The `comb` function is used to calculate the combination. The `fact` and `invfact` functions are used to calculate the factorial and inverse factorial. The `precompute` function is used to precompute the powers of `a` and `b`.<｜end▁of▁sentence｜>
