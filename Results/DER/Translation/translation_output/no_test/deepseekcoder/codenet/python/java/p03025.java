<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int p = (int)Math.pow(10, 9) + 7;
    static int n, a, b, c;
    static long[] fact, invFact;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        fact = new long[2 * n + 1];
        invFact = new long[2 * n + 1];

        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = (fact[i - 1] * i) % p;
        }

        invFact[2 * n] = pow(fact[2 * n], p - 2);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % p;
        }

        long powA = 1, powB = 1, ans = 0;
        long invAB = pow(a + b, p - 2);
        a = (int)((a * invAB) % p);
        b = (int)((b * invAB) % p);

        for (int i = 0; i < n; i++) {
            powA = (powA * a) % p;
            powB = (powB * b) % p;
        }

        for (int m = n; m < 2 * n; m++) {
            long temp = (comb(m - 1, n - 1) * ((powA * powB) % p + (powA * powB) % p)) % p;
            ans = (ans + temp * m) % p;
        }

        ans = (ans * pow(1 - c, p - 2)) % p;

        System.out.println(ans);
    }

    static long pow(long x, long y) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    static long comb(int n, int r) {
        if (n < r)
            return 0;
        if (n < 0 || r < 0)
            return 0;
        return (fact[n] * ((invFact[r] * invFact[n - r]) % p)) % p;
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, calculates the factorial and inverse factorial of 2n, and then calculates the combination of n and r using these factorials. It then calculates the powers of a and b, and uses these to calculate the answer. The answer is then printed to the standard output.
<|EOT|>
