<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = 2**7;
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j + i, i) * 2**j;
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = l + "F" + OT + ans;
        }
        System.out.println(ans);
    }

    public static int comb(int a, int b) {
        if (a < b || b < 0) {
            return 0;
        }
        return frac[a] * fraci[b] * fraci[a - b] % mod;
    }

    public static int[] frac;
    public static int[] fraci;
    public static int mod = 10**18 + 3;

    static {
        frac = new int[1341];
        fraci = new int[1341];
        frac[0] = 1;
        for (int i = 1; i < 1341; i++) {
            frac[i] = i * frac[i - 1] % mod;
        }
        fraci[1340] = pow(frac[1340], mod - 2, mod);
        for (int i = 1339; i >= 0; i--) {
            fraci[i] = fraci[i + 1] * (1341 + i) % mod;
        }
    }
}
```
This is the Java code for the given Python code. The code uses the same logic as the Python code, but it is written in Java. The `frac` and `fraci` arrays are initialized using the `static` block, which is executed when the class is loaded. The `comb` method is also defined as a static method, which is called from the `main` method. The rest of the code is similar to the Python code, with some minor changes to make it compatible with Java.</s>
