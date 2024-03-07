<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.math.BigInteger;

public class Frac {
    private static final BigInteger MOD = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));

    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        int[] L = new int[301];

        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j + i, i).multiply(BigInteger.valueOf(2).pow(j)));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = l + "F" + OT + ans;
        }

        System.out.println(ans);
    }

    private static BigInteger comb(int a, int b) {
        if (a < b || b < 0) {
            return BigInteger.ZERO;
        }
        return frac(a).multiply(fraci(b)).multiply(fraci(a - b)).mod(MOD);
    }

    private static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = frac[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        return frac;
    }

    private static BigInteger[] fraci(int limit) {
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit - 1] = frac(limit).modInverse(MOD);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(limit + i + 1)).mod(MOD);
        }
        return fraci;
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `BigInteger` class from the `java.math` package to handle large numbers, and it uses the `mod` method to perform modular arithmetic. The `frac` and `fraci` methods are similar to the Python functions with the same name, and they are used to compute the values of the `frac` and `fraci` arrays. The `comb` method is used to compute the value of the `ci` variable, and it is similar to the Python function with the same name. The rest of the code is similar to the Python code, with the exception of the `repeat` method, which is used to repeat a string a certain number of times.</s>
