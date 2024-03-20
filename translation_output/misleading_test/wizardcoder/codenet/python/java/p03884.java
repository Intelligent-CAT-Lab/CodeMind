Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10, 18) + 3;

        int limit = 1341;
        int[] frac = new int[limit];
        frac[0] = 1;
        for (int i = 1; i < limit; i++) {
            frac[i] = (int) (i * frac[i-1] % mod);
        }
        int[] fraci = new int[limit];
        fraci[limit-1] = (int) Math.pow(frac[limit-1], mod - 2, mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = (int) (fraci[i+1] * (limit + i + 1) % mod);
        }

        int K = sc.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += (int) Math.pow(2, j) * comb(j+i, i);
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

    public static int comb(int a, int b) {
        if (a < 0 || b < 0 || a < b) {
            return 0;
        }
        return (int) Math.pow(frac[a], mod - 2, mod) * (int) Math.pow(frac[b], mod - 2, mod) * (int) Math.pow(frac[a-b], mod - 2, mod) % mod;
    }
}
```<|endoftext|>
