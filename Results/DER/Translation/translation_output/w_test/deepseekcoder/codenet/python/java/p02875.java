<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
7


```
N = int(input())

nn = N + 10
P = 998244353

fa = [1] * (nn+1)
fainv = [1] * (nn+1)
for i in range(nn):
    fa[i+1] = fa[i] * (i+1) % P
fainv[-1] = pow(fa[-1], P-2, P)
for i in range(nn)[::-1]:
    fainv[i] = fainv[i+1] * (i+1) % P
C = lambda a, b: fa[a] * fainv[b] % P * fainv[a-b] % P if 0 <= b <= a else 0

ans = pow(3, N, P)
for i in range(N//2 + 1, N + 1):
    ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P

print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final BigInteger P = BigInteger.valueOf(998244353);
    static BigInteger[] fa, fainv;

    static void init(int nn) {
        fa = new BigInteger[nn+1];
        fainv = new BigInteger[nn+1];
        fa[0] = BigInteger.ONE;
        fainv[0] = BigInteger.ONE;
        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i-1].multiply(BigInteger.valueOf(i)).mod(P);
        }
        fainv[nn] = fa[nn].modInverse(P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = fainv[i+1].multiply(BigInteger.valueOf(i+1)).mod(P);
        }
    }

    static BigInteger C(int a, int b) {
        if (b > a || b < 0) return BigInteger.ZERO;
        return fa[a].multiply(fainv[b]).multiply(fainv[a-b]).mod(P);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        init(nn);
        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = ans.subtract(BigInteger.TWO.multiply(C(N, i)).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N - i), P))).mod(P);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It calculates the binomial coefficient `C(N, i)`, and uses the modular exponentiation to calculate `pow(2, N - i, P)`. The result is then printed out.
<|EOT|>
