<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
FESSSSSSSTIVAL


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

### Response:
Here is the Java version of your Python code:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static BigInteger mod = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));
    static BigInteger[] frac, fraci;

    static void frac(int limit) {
        frac = new BigInteger[limit];
        fraci = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i-1]).mod(mod);
        }
        fraci[limit-1] = BigInteger.ONE.divide(frac[limit-1]);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = BigInteger.valueOf(limit - i).multiply(fraci[i+1]).mod(mod);
        }
    }

    static BigInteger comb(int a, int b) {
        if (a < b || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a-b]).mod(mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        frac(301);
        BigInteger seg = BigInteger.ONE.shiftLeft(7);
        String OT = "EESSTTIIVVAALL";
        BigInteger[] L = new BigInteger[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j+i, i).shiftLeft(j));
            }
            L[i] = K.divide(ci);
            K = K.mod(ci);
        }
        String ans = "F".repeat(K) + "ESTIVAL";
        for (int i = 0; i < 301; i++) {
            ans = L[i].toString() + "F".repeat(i) + OT + ans;
        }
        System.out.println(ans);
    }
}
```

Please note that Java does not support negative indexing for arrays, so I had to use a regular loop instead of a for-each loop. Also, Java does not support the `**` operator for exponentiation, so I used the `BigInteger.pow()` method instead.
<|EOT|>
