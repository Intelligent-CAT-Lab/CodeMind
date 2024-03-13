<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(mod);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = BigInteger.valueOf(limit - i).multiply(fraci[i + 1]).mod(mod);
        }
    }

    static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";
        frac(1341);

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j + i, i).shiftLeft(j));
            }
            L[i] = K.divide(ci).intValue();
            K %= ci.intValue();
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = "F".repeat(l) + OT + ans;
        }

        System.out.println(ans);
    }
}
```

Please note that Java does not support the `**` operator for exponentiation, so we use `Math.pow()` instead. Also, Java does not have a built-in method for repeating a string, so we use the `repeat()` method of the `String` class. Also, Java does not have a built-in method for integer division, so we use the `divide()` method of the `BigInteger` class.<｜end▁of▁sentence｜>
