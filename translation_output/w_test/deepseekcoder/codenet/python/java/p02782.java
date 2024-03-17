<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    static long mod = (long)Math.pow(10,9)+7;
    static int rng = 2000100;
    static long[] fctr = new long[rng];

    static {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i-1]*i)%mod;
        }
    }

    static long finv(int x) {
        return pow(fctr[x], (int)(mod-2), mod);
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long c = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                c = (c * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return c;
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return (fctr[n]*finv(n-k)*finv(k))%mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the combinations, and prints the result. The `pow` function is used to calculate the modular inverse. The `cmb` function calculates the combination using the factorial and modular inverse. The `main` function is the entry point of the program.
<|EOT|>
