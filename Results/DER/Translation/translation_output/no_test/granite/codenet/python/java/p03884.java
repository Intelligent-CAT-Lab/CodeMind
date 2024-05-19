System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
public class Main {
    static final long MOD = (long)1e18 + 3;

    static long[] frac(int limit) {
        long[] frac = new long[limit];
        for (int i = 0; i < limit; i++) {
            frac[i] = 1;
        }
        for (int i = 2; i < limit; i++) {
            frac[i] = i * frac[i-1] % MOD;
        }
        long[] fraci = new long[limit];
        fraci[limit-1] = pow(frac[limit-1], MOD-2, MOD);
        for (int i = limit-2; i >= 0; i--) {
            fraci[i] = fraci[i+1] * (limit + i + 1) % MOD;
        }
        return frac;
    }

    static long pow(long a, long b, long mod) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ret;
    }

    static long comb(long[] frac, long[] fraci, int a, int b) {
        if (a < b || b < 0) {
            return 0;
        }
        return frac[a] * fraci[b] % MOD * fraci[a-b] % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int seg = 1 << 7;
        String OT = "EESSTTIIVVAALL";

        long[] frac = frac(301);
        long[] fraci = new long[frac.length];
        for (int i = 0; i < frac.length; i++) {
            fraci[i] = pow(frac[i], MOD-2, MOD);
        }

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            long ci = 0;
            for (int j = 0; j <= 7; j++) {
                ci += comb(frac, fraci, i+j, i) * (1 << j);
            }
            L[i] = K / ci;
            K %= ci;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < K; i++) {
            ans.append('F');
        }
        for (int i = 0; i < 301; i++) {
            for (int j = 0; j < L[i]; j++) {
                ans.append('F');
            }
            ans.append(OT);
        }
        System.out.println(ans.toString());
    }
}
```<|endoftext|>
