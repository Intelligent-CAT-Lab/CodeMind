System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
2


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


Answer:
```java
import java.util.*;

public class Main {
    static int MOD = 100000007;

    static long[] fact;
    static long[] finv;
    static long[] inv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r = n - a;

        prepare(n);

        long ans = 0;
        // aåãããããèªå·±ã«ã¼ããæããªããã¿ã¼ã³
        for (int l = 0; l < a; l++) {
            long tmp1 = fact[a] * finv[l] % MOD * finv[a - l] % MOD;
            long tmp2 = fact[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD;
        }

        // aåä¸­k+1åç®ã§ã¯ããã¦èªå·±ã«ã¼ããæã¤ããããã¾ã§ãããã¿ã¼ã³
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = fact[k] * finv[l] % MOD * finv[k - l] % MOD;
                long tmp2 = fact[n - l - 1] * (k - l) % MOD * inv[r + k - l] % MOD;
                ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD;
            }
        }

        System.out.println(ans);
    }

    static void prepare(int n) {
        fact = new long[n + 1];
        finv = new long[n + 1];
        inv = new long[n + 1];

        fact[0] = fact[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;

        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
}
```<|endoftext|>
