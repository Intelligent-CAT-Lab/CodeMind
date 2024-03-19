<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
FESSSSSSSTIVAL2

```
mod = 10**18 + 3

def frac(limit):
    frac = [1]*limit
    for i in range(2,limit):
        frac[i] = i * frac[i-1]%mod
    fraci = [None]*limit
    fraci[-1] = pow(frac[-1], mod -2, mod)
    for i in range(-2, -limit-1, -1):
        fraci[i] = fraci[i+1] * (limit + i + 1) % mod
    return frac, fraci
frac, fraci = frac(1341)
def comb(a, b):
    if not a >= b >= 0:
        return 0
    return frac[a]*fraci[b]*fraci[a-b]%mod

K = int(input())
seg = 2**7
OT = 'EESSTTIIVVAALL'

L = [0]*301
for i in range(300, -1, -1):
    ci = sum(comb(j+i, i)*2**j for j in range(8)) 
    L[i] = K//ci
    K %= ci
    

ans = 'F'*K + 'ESTIVAL'
for l in L:
    ans = l*'F' + OT + ans

print(ans)
```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static long mod = (long) Math.pow(10, 18) + 3;
    static long[] frac, fraci;

    static void frac(int limit) {
        frac = new long[limit];
        fraci = new long[limit];
        frac[0] = 1;
        for (int i = 1; i < limit; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        fraci[limit - 1] = pow(frac[limit - 1], mod - 2, mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = (fraci[i + 1] * (i + 1)) % mod;
        }
    }

    static long comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return 0;
        }
        return (frac[a] * fraci[b] * fraci[a - b]) % mod;
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";
        frac(301);
        long[] L = new long[301];
        for (int i = 300; i >= 0; i--) {
            long ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j + i, i) * Math.pow(2, j);
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F".repeat((int) K) + "ESTIVAL";
        for (int l : L) {
            ans = "F".repeat((int) l) + OT + ans;
        }
        System.out.println(ans);
    }
}
```

Please note that Java does not support the `**` operator for exponentiation, so we use the `Math.pow` method instead. Also, Java does not support the `//=` operator for integer division, so we use the `/` operator instead.<｜end▁of▁sentence｜>
