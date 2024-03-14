<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10, 18) + 3;
        int limit = 1341;
        int[] frac = new int[limit + 1];
        int[] fraci = new int[limit + 1];
        frac[0] = 1;
        frac[1] = 1;
        for (int i = 2; i <= limit; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        fraci[limit] = (int) Math.pow(frac[limit], mod - 2, mod);
        for (int i = limit - 1; i >= 0; i--) {
            fraci[i] = (fraci[i + 1] * (limit + i + 1)) % mod;
        }
        int K = sc.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += (int) Math.pow(2, j) * comb(j + i, i);
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F" + "ESTIVAL";
        for (int l : L) {
            ans = l + "F" + OT + ans;
        }
        System.out.println(ans);
    }

    public static long comb(int a, int b) {
        if (a < b || b < 0) {
            return 0;
        }
        return (long) frac[a] * fraci[b] % mod * fraci[a - b] % mod;
    }
}
```
<|endoftext|>
