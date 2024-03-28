<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
51

```
s=int(input())
if  s<3:print(0);exit()
n=s//3
mod=10**9+7
fact=[1]*(2*s+1)
inv=[1]*(2*s+1)
for i in range(2,2*s+1):
    fact[i]=i*fact[i-1]%mod
inv[-1]=pow(fact[-1],-1,mod)
for i in range(2*s,1,-1):
    inv[i-1]=inv[i]*i%mod
def comb(x,y):return fact[x]*inv[y]%mod*inv[x-y]%mod if x>=y>=0 else 0
ans=0
for i in range(1,s+1):
    ans=(ans+comb(s-3*i+i-1,i-1))%mod
print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;
        long mod = (long) Math.pow(10, 9) + 7;
        long[] fact = new long[2 * s + 1];
        long[] inv = new long[2 * s + 1];
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i < 2 * s + 1; i++) {
            fact[i] = (i * fact[i - 1]) % mod;
        }
        inv[2 * s] = pow(fact[2 * s], mod - 2, mod);
        for (int i = (2 * s) - 1; i > 0; i--) {
            inv[i] = (inv[i + 1] * (i + 1)) % mod;
        }
        long ans = 0;
        for (int i = 1; i < s + 1; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1, fact, inv, mod)) % mod;
        }
        System.out.println(ans);
    }

    public static long comb(int x, int y, long[] fact, long[] inv, long mod) {
        if (x >= y && y >= 0) {
            return (fact[x] * inv[y] % mod * inv[x - y] % mod) % mod;
        } else {
            return 0;
        }
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It calculates the number of ways to choose `i` elements from `s` elements, where `s` is the input number and `i` varies from 1 to `s`. The result is then printed out. The code uses the modulo operation to avoid overflow. The `comb` function calculates the combination of `x` and `y` using the factorial and inverse factorial arrays. The `pow` function is used to calculate the power of a number modulo another number.
<|EOT|>
