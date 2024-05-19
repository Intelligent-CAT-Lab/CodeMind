System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = 100000007;

        long[] f = new long[2 * n + 1];
        long[] invf = new long[2 * n + 1];
        f[0] = 1;
        invf[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            f[i] = (f[i - 1] * i) % p;
            invf[i] = pow(f[i], p - 2, p);
        }

        long ans = 0;
        long inv_100 = pow(100, p - 2, p);
        a = (a * inv_100) % p;
        b = (b * inv_100) % p;
        c = (c * inv_100) % p;

        long inv_ab = pow((a + b), p - 2, p);
        a = (a * inv_ab) % p;
        b = (b * inv_ab) % p;

        long[] pow_a = new long[n + 1];
        long[] pow_b = new long[n + 1];
        pow_a[0] = 1;
        pow_b[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow_a[i] = (pow_a[i - 1] * a) % p;
            pow_b[i] = (pow_b[i - 1] * b) % p;
        }

        for (int m = n; m < 2 * n; m++) {
            ans += comb(m - 1, n - 1, f, invf, p) * ((pow_a[n] * pow_b[m - n]) % p + (pow_a[m - n] * pow_b[n]) % p) * m;
            ans %= p;
        }

        ans *= pow(1 - c, p - 2, p);
        ans %= p;

        System.out.println(ans);
    }

    public static long pow(long a, long b, long p) {
        long res = 1;
        a %= p;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % p;
            b >>= 1;
            a = (a * a) % p;
        }
        return res;
    }

    public static long comb(int n, int k, long[] f, long[] invf, int p) {
        if (n < k)
            return 0;
        if (n < 0 || k < 0)
            return 0;
        return f[n] * invf[k] % p * invf[n - k] % p;
    }
}
```<|endoftext|>
