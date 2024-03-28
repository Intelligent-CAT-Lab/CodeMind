<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
2


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

### Response:
```java
import java.util.Scanner;

public class Main {
    static long MOD = (long)Math.pow(10,9)+7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x+y)%3 != 0 || x+y < y || x+y < x) {
            System.out.println(0);
            System.exit(0);
        }
        int n = (x+y)/3;
        x -= n;
        y -= n;
        long[] fact = new long[n+1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = factN * modinv(factX) * modinv(factY) % MOD;
        System.out.println(c);
    }

    public static long modinv(long a) {
        long g = xgcd(a, MOD)[0];
        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return xgcd(a, MOD)[1];
        }
    }

    public static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            a = a % b;
            long tmp = x0;
            x0 = x1;
            x1 = tmp - q * x1;
            tmp = y0;
            y0 = y1;
            y1 = tmp - q * y1;
        }
        return new long[]{a, x0, y0};
    }
}
```
<|EOT|>
