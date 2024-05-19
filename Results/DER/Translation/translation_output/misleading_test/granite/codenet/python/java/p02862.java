System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
35

```
def xgcd(a, b):
    x0, y0, x1, y1 = 1, 0, 0, 1
    while b!= 0:
        q, a, b = a // b, b, a % b
        x0, x1 = x1, x0 - q * x1
        y0, y1 = y1, y0 - q * y1
    return a, x0, y0

def modinv(a, m):
    g, x, y = xgcd(a, m)
    if g!= 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m

MOD = 10**9+7
x, y = map(int, input().split())
if (x+y)%3!= 0 or 3*x < x+y or 3*y < x+y:
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


Answer:
```java
import java.util.*;

public class Main {
    static long MOD = 100000007;

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long xgcd(long a, long b, long[] x, long[] y) {
        if (a == 0) {
            x[0] = 0;
            y[0] = 1;
            return b;
        }
        long x1[] = new long[1];
        long y1[] = new long[1];
        long d = xgcd(b % a, a, x1, y1);
        x[0] = y1[0] - (b / a) * x1[0];
        y[0] = x1[0];
        return d;
    }

    static long modInverse(long a, long m) {
        long x[] = new long[1];
        long y[] = new long[1];
        long g = xgcd(a, m, x, y);
        long res = (x[0] % m + m) % m;
        return res;
    }

    static long nCrModPFermat(long n, long r, long p) {
        if (r == 0)
            return 1;
        long[] fac = new long[(int) n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;
        return (fac[(int) n] * modInverse(fac[(int) r], p) % p * modInverse(fac[(int) (n - r)], p) % p) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3!= 0 || 3 * x < x + y || 3 * y < x + y) {
            sb.append(0 + "\n");
        } else {
            long n = (x + y) / 3;
            x -= n;
            y -= n;
            long ans = nCrModPFermat(n, x, MOD);
            ans *= nCrModPFermat(n, y, MOD);
            ans %= MOD;
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}
```<|endoftext|>
