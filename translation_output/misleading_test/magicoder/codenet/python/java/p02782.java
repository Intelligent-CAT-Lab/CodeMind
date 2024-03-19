<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
-19

```
mod = 10**9+7
rng = 2000100
fctr = [1]+[0]*(rng-1)
for i in range(1,rng):
  fctr[i] = fctr[i-1]*i%mod
def finv(x):
  return pow(fctr[x],mod-2,mod)
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv(n-k)*finv(k)%mod

x1,y1,x2,y2 = map(int,input().split())
print((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int RNG = 2000100;
    static long[] fctr = new long[RNG];

    static {
        fctr[0] = 1;
        for (int i = 1; i < RNG; i++) {
            fctr[i] = (fctr[i - 1] * i) % MOD;
        }
    }

    static long finv(int x) {
        return pow(fctr[x], MOD - 2, MOD);
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (fctr[n] * finv(n - k) % MOD * finv(k) % MOD) % MOD;
        }
    }

    static long pow(long x, int n, int m) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % m;
            }
            x = (x * x) % m;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();

        long result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % MOD;
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It calculates the combination of two numbers using the formula `nCr = n! / (r!(n-r)!)`, where `n!` is the factorial of `n`, and `r!(n-r)!` is the factorial of `r` and `n-r`. The `pow` function is used to calculate the modular exponentiation. The `finv` function calculates the inverse of a number using Fermat's little theorem. The `cmb` function calculates the combination of two numbers. The `main` function reads the input from the user and prints the result.<｜end▁of▁sentence｜>
