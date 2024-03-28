<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = (int) Math.pow(10, 9) + 7;
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        int[] fact = new int[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        int factX = fact[x];
        int factY = fact[y];
        int factN = fact[n];
        int c = (factN * modinv(factX, MOD) * modinv(factY, MOD)) % MOD;
        System.out.println(c);
    }

    public static int modinv(int a, int m) {
        int g, x, y;
        g = xgcd(a, m);
        if (g != 1) {
            throw new Exception("modular inverse does not exist");
        } else {
            x = (int) Math.pow(a, (m - 1) % m, m);
            return x % m;
        }
    }

    public static int xgcd(int a, int b) {
        int x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            int q = a / b, a1 = b, b1 = a % b;
            x0 = x1;
            x1 = x0 - q * x1;
            y0 = y1;
            y1 = y0 - q * y1;
        }
        return a1, x1, y1;
    }
}
```</s>
