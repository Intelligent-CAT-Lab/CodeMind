System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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

    static long[] fact;

    static long modinv(long a, long m) {
        long g = xgcd(a, m)[0];
        if (g!= 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return (a % m + m) % m;
        }
    }

    static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b!= 0) {
            long q = a / b;
            long a1 = a % b, b1 = b;
            a = a1;
            b = b1;
            long x = x0, y = y0;
            x0 = x1;
            y0 = y1;
            x1 = x - q * x1;
            y1 = y - q * y1;
        }
        return new long[]{a, x0, y0};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3!= 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        fact = new long[(int) n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long c = fact[(int) n] * modinv(fact[(int) x], MOD) % MOD * modinv(fact[(int) y], MOD) % MOD;
        System.out.println(c);
    }
}
```<|endoftext|>
