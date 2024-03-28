<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
def prepare(n, MOD):
    factorials = [1] * (n + 1)
    for i in range(2, n + 1):
        factorials[i] = factorials[i - 1] * i % MOD
    finvs = [1] * (n + 1)
    finvs[n] = pow(factorials[n], MOD - 2, MOD)
    for i in range(n, 1, -1):
        finvs[i - 1] = finvs[i] * i % MOD
    return factorials, finvs


def solve(n, a):
    MOD = 10 ** 9 + 7
    facts, finvs = prepare(n, MOD)
    invs = [facts[i - 1] * finvs[i] % MOD for i in range(n + 1)]  # invs[0]: undefined
    r = n - a

    ans = 0
    # aåãããããèªå·±ã«ã¼ããæããªããã¿ã¼ã³
    for l in range(a):
        tmp1 = facts[a] * finvs[l] % MOD * finvs[a - l] % MOD
        tmp2 = facts[n - l - 1] * (a - l) % MOD
        ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD

    # aåä¸­k+1åç®ã§ã¯ããã¦èªå·±ã«ã¼ããæã¤ããããã¾ã§ã®kåã§å¨ç¹ç¯ã§ãããã¿ã¼ã³
    for k in range(1, a):
        for l in range(k):
            tmp1 = facts[k] * finvs[l] % MOD * finvs[k - l] % MOD
            tmp2 = facts[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD
            ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD

    return ans


n, a = map(int, input().split())
print(solve(n, a))

```

@@ Response
```java
import java.util.*;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static long[] factorials, finvs, invs;

    static void prepare(int n) {
        factorials = new long[n + 1];
        finvs = new long[n + 1];
        invs = new long[n + 1];
        factorials[0] = factorials[1] = 1;
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = 2; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = (finvs[i] * i) % MOD;
        }
        for (int i = 0; i <= n; i++) {
            invs[i] = (factorials[i] * finvs[i]) % MOD;
        }
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    static long solve(int n, int a) {
        prepare(n);
        long ans = 0;
        int r = n - a;
        for (int l = 0; l < a; l++) {
            long tmp1 = (factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD);
            long tmp2 = (factorials[n - l - 1] * (a - l) % MOD);
            ans = (ans + (((l & 1) == 0 ? 1 : -1) * tmp1 * tmp2) % MOD) % MOD;
        }
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = (factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD);
                long tmp2 = (factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD);
                ans = (ans + (((l & 1) == 0 ? 1 : -1) * tmp1 * tmp2) % MOD) % MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(solve(n, a));
    }
}
```

This Java code translates the Python code you provided. It includes the `prepare` function to calculate factorials and their inverses, and the `solve` function to calculate the final answer. The `pow` function is used to calculate the modular exponentiation. The `main` function reads the input and prints the result of the `solve` function.<｜end▁of▁sentence｜>
