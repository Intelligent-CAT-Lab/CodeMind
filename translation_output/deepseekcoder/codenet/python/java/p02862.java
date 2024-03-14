<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    static long MOD = (long)Math.pow(10,9)+7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if ((x+y)%3 != 0 || x+y < 3*Math.min(x,y)) {
            System.out.println(0);
            System.exit(0);
        }
        long n = (x+y)/3;
        x -= n;
        y -= n;
        long[] fact = new long[(int)n+1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        long factX = fact[(int)x];
        long factY = fact[(int)y];
        long factN = fact[(int)n];
        long c = factN * modinv(factX) * modinv(factY) % MOD;
        System.out.println(c);
    }

    public static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            a = a % b;
            long temp = x0;
            x0 = x1;
            x1 = temp - q * x1;
            temp = y0;
            y0 = y1;
            y1 = temp - q * y1;
        }
        return new long[]{a, x0, y0};
    }

    public static long modinv(long a) {
        long[] gcdResult = xgcd(a, MOD);
        if (gcdResult[0] != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return gcdResult[1] % MOD;
        }
    }
}
```

This Java code does the same thing as the Python code. It calculates the modular inverse of a number using the extended Euclidean algorithm, and then uses this to calculate the binomial coefficient. The binomial coefficient is calculated using the factorial of the numbers, and the factorials are calculated using dynamic programming. The numbers are read from the standard input, and the result is printed to the standard output.
<|EOT|>
