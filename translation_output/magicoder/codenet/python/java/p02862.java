<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
def xgcd(a, b):
    x0, y0, x1, y1 = 1, 0, 0, 1
    while b != 0:
        q, a, b = a // b, b, a % b
        x0, x1 = x1, x0 - q * x1
        y0, y1 = y1, y0 - q * y1
    return a, x0, y0

def modinv(a, m):
    g, x, y = xgcd(a, m)
    if g != 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m

MOD = 10**9+7
x, y = map(int, input().split())
if (x+y)%3 != 0 or 3*x < x+y or 3*y < x+y:
    print(0)
    exit()
n = (x+y)//3
x -= n
y -= n
fact = [1, 1]
for i in range(2,n+1):
    fact.append(fact[i-1] * i % MOD)
factX = fact[x]
factY = fact[y]
factN = fact[n]
# print(x,y,n)
# print(factX,factY,factN)

c = factN * modinv(factX, MOD) * modinv(factY, MOD)
c %= MOD
print(c)

```

@@ Response
```java
import java.util.*;

public class Main {
    static long MOD = 1000000007;
    static long[] fact = new long[100001];

    static long xgcd(long a, long b, long[] x) {
        if (b == 0) {
            x[0] = 1;
            x[1] = 0;
            return a;
        }
        long[] y = new long[2];
        long g = xgcd(b, a % b, y);
        x[0] = y[1];
        x[1] = y[0] - (a / b) * y[1];
        return g;
    }

    static long modinv(long a, long m) {
        long[] x = new long[2];
        long g = xgcd(a, m, x);
        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return (x[0] % m + m) % m;
        }
    }

    static long C(long n, long r, long p) {
        if (r == 0)
            return 1;
        return (fact[(int) n] * modinv(fact[(int) r] * fact[(int) (n - r)] % p, p)) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3 != 0 || x + y < 3 * Math.max(x, y)) {
            System.out.println(0);
            return;
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        fact[0] = 1;
        for (int i = 1; i <= (int) n; i++)
            fact[i] = (fact[i - 1] * i) % MOD;
        long c = C(n, x, MOD);
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It calculates the number of ways to choose `x` items from `n` items, where `n` is the sum of `x` and `y` divided by 3, and `x` and `y` are the input numbers. The code uses the extended Euclidean algorithm to calculate the modular multiplicative inverse, and the combination formula to calculate the number of ways.<｜end▁of▁sentence｜>
