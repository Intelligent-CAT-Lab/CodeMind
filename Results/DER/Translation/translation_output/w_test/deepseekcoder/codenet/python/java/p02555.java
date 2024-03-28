<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
3


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
    static final long MOD = 1_000_000_007;
    static long[] fact, inv;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;
        fact = new long[2 * s + 1];
        inv = new long[2 * s + 1];
        for (int i = 0; i < 2 * s + 1; i++) {
            fact[i] = i != 0 ? i * fact[i - 1] % MOD : 1;
        }
        inv[2 * s] = pow(fact[2 * s], MOD - 2);
        for (int i = 2 * s - 1; i >= 0; i--) {
            inv[i] = i != 2 * s - 1 ? inv[i + 1] * (i + 1) % MOD : 1;
        }
        long ans = 0;
        for (int i = 1; i <= s + 1; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % MOD;
        }
        System.out.println(ans);
    }

    static long comb(int x, int y) {
        if (x >= y && y >= 0) {
            return fact[x] * inv[y] % MOD * inv[x - y] % MOD;
        } else {
            return 0;
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's less than 3, and if so, prints 0 and exits. If the input is not less than 3, it calculates the number of combinations and prints the result. The `comb` function calculates the combination of two numbers, and the `pow` function calculates the power of a number modulo a given modulus.
<|EOT|>
