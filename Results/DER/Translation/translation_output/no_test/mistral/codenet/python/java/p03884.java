<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.math.BigInteger;

public class Main {
    private static final BigInteger mod = BigInteger.valueOf(10000000000000000000L);

    private static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i.longValue()).multiply(frac[i-1]).mod(mod);
        }
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit-1] = frac[limit-1].pow(mod.subtract(BigInteger.valueOf(2)), mod).mod(mod);
        for (int i = limit-2; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(limit.longValue()+i+1)).mod(mod);
        }
        return new BigInteger[]{fracs, fraci};
    }

    private static BigInteger comb(int a, int b) {
        if (a < 0 || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a-b]).mod(mod);
    }

    public static void main(String[] args) {
        int K = Integer.parseInt(input());
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 299; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j+i, i).shiftLeft(j).intValue();
            }
            L[i] = K / ci;
            K %= ci;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < L.length; i++) {
            ans.append(L[i]).append("F");
        }
        ans.append(OT).append(ans.substring(ans.length()-2));

        System.out.println(ans.toString());
    }
}
```</s>
