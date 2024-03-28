<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += (BigInteger.valueOf(2).pow(j).multiply(BigInteger.valueOf(j + i))).mod(BigInteger.valueOf(1000000007)).intValue();
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F" + "E" * K + "STIVAL";
        for (int l : L) {
            ans = l * "F" + OT + ans;
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
