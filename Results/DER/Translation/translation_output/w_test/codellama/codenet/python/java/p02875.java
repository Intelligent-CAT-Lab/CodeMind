<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int P = 998244353;
        int nn = N + 10;

        BigInteger[] fa = new BigInteger[nn + 1];
        BigInteger[] fainv = new BigInteger[nn + 1];

        fa[0] = BigInteger.ONE;
        fainv[nn] = BigInteger.ONE;

        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(P));
            fainv[i - 1] = fainv[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(P));
        }

        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), BigInteger.valueOf(P));

        for (int i = N / 2 + 1; i <= N; i++) {
            BigInteger C = fa[N].multiply(fainv[i]).mod(BigInteger.valueOf(P)).multiply(fainv[N - i]).mod(BigInteger.valueOf(P));
            ans = ans.subtract(C.multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(P)));
        }

        System.out.println(ans.mod(BigInteger.valueOf(P)));
    }
}
```
Note that the `modPow` method is used to compute the modular exponentiation, and the `mod` method is used to compute the modular arithmetic. The `BigInteger` class is used to represent the large numbers.</s>
