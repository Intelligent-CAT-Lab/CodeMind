<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long fact[] = new long[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++)
            fact[i] = fact[i-1]*i;
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX, MOD) * modinv(factY, MOD);
        c %= MOD;
        System.out.println(c);
    }
    static long modinv(long a, long m)
    {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1)
        {
            long q = a / m;
            long t = m;

            m = a % m, a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x = x + m0;

        return x;
    }
}
```
'''
<|endoftext|>
