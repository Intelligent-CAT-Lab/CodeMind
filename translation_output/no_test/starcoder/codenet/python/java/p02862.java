<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x+y)%3!= 0 || 3*x < x+y || 3*y < x+y) {
            System.out.println(0);
            return;
        }
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long fact[] = new long[n+1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % 1000000007;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX, 1000000007) * modinv(factY, 1000000007);
        c %= 1000000007;
        System.out.println(c);
    }
    public static long modinv(long a, long m) {
        long g = gcd(a, m);
        if(g!= 1) {
            return -1;
        }
        return (m + m - a) % m;
    }
    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
```
<|endoftext|>
