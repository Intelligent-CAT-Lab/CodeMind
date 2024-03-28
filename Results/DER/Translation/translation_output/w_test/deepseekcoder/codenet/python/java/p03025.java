<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 25 25 50

Expected output:
2


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
    static long p = (long)Math.pow(10, 9) + 7;
    static long ans = 0;
    static ArrayList<Long> f = new ArrayList<>();
    static ArrayList<Long> inv = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        fact(2 * n);
        invfact(2 * n);

        ArrayList<Long> pow_a = new ArrayList<>(Collections.nCopies(n + 1, 1L));
        ArrayList<Long> pow_b = new ArrayList<>(Collections.nCopies(2 * n + 1, 1L));

        long inv_100 = pow(100, p - 2, p);
        a = a * inv_100 % p;
        b = b * inv_100 % p;
        c = c * inv_100 % p;

        long inv_ab = pow(a + b, p - 2, p);
        a = a * inv_ab % p;
        b = b * inv_ab % p;

        for (int i = 1; i <= n; i++) {
            pow_a.set(i, (pow_a.get(i - 1) * a) % p);
            pow_b.set(i, (pow_b.get(i - 1) * b) % p);
        }

        for (int m = n; m <= 2 * n; m++) {
            ans = (ans + comb(m - 1, n - 1) * ((pow_a.get(n) * pow_b.get(m - n) + pow_a.get(m - n) * pow_b.get(n)) * m) % p) % p;
        }

        ans = (ans * pow(1 - c, p - 2, p)) % p;

        System.out.println(ans);
    }

    static void fact(int n) {
        f.add(1L);
        for (int i = 1; i <= n; i++) {
            f.add((f.get(i - 1) * i) % p);
        }
    }

    static void invfact(int n) {
        inv.add(pow(f.get(n), p - 2));
        for (int i = n; i > 0; i--) {
            inv.add(0, (inv.get(0) * i) % p);
        }
    }

    static long comb(int a, int b) {
        if (a < b) {
            return 0;
        }
        if (a < 0 || b < 0) {
            return 0;
        }
        return (f.get(a) * inv.get(b) * inv.get(a - b)) % p;
    }

    static long pow(long x, long y) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, calculates the answer, and prints it to the standard output. The code uses dynamic programming to calculate factorials and their inverses, and uses bitwise operations to calculate powers. The code also uses the `ArrayList` class to store the factorials and their inverses.
<|EOT|>
