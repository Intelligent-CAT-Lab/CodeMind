<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
14


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
    static final long mod = (long) Math.pow(10, 9) + 7;
    static final int rng = 2000100;
    static long[] fctr = new long[rng];

    static {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
        }
    }

    static long finv(long x) {
        return pow(fctr[(int) x], mod - 2, mod);
    }

    static long cmb(long n, long k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (fctr[(int) n] * finv(n - k) * finv(k)) % mod;
        }
    }

    static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
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

        System.out.println((cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod);
    }
}
```

This Java code does the same thing as the Python code. It calculates the combination of two numbers using the formula `nCr = n! / (r!(n-r)!)`, where `n!` is the factorial of `n`, and `r!(n-r)!` is the factorial of `r` and `n-r`. The `pow` function is used to calculate the modular exponentiation. The `finv` function is used to calculate the inverse of a number. The `cmb` function is used to calculate the combination of two numbers. The `main` function reads the input from the user and prints the result.<｜end▁of▁sentence｜>
