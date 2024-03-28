Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
-35

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

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger[] factorials = new BigInteger[n + 1];
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        BigInteger[] finvs = new BigInteger[n + 1];
        finvs[n] = factorials[n].modInverse(MOD);
        for (int i = n - 1; i >= 0; i--) {
            finvs[i] = finvs[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }

        BigInteger[] invs = new BigInteger[n + 1];
        invs[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            invs[i] = invs[i - 1].multiply(factorials[i]).mod(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        for (int l = 0; l < a; l++) {
            BigInteger tmp1 = factorials[a].multiply(finvs[l]).mod(MOD).multiply(finvs[a - l]).mod(MOD);
            BigInteger tmp2 = factorials[n - l - 1].multiply(BigInteger.valueOf(a - l)).mod(MOD);
            ans = ans.add(tmp1.multiply(tmp2).mod(MOD).multiply(BigInteger.valueOf((-1) ^ (l & 1))).mod(MOD));
        }

        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                BigInteger tmp1 = factorials[k].multiply(finvs[l]).mod(MOD).multiply(finvs[k - l]).mod(MOD);
                BigInteger tmp2 = factorials[n - l - 1].multiply(BigInteger.valueOf(k - l)).mod(MOD).multiply(invs[n - l - 1].multiply(BigInteger.valueOf(r + k - l)).mod(MOD)).mod(MOD);
                ans = ans.add(tmp1.multiply(tmp2).mod(MOD).multiply(BigInteger.valueOf((-1) ^ (l & 1))).mod(MOD));
            }
        }

        System.out.println(ans);
    }
}
```<|endoftext|>
