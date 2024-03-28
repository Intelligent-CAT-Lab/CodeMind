<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```
[/INST]
```java
import java.math.BigInteger;
import java.util.Scanner;

public class BallAndBox5 {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);
    private static final BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

    private static final BigInteger P(BigInteger n, BigInteger r) {
        return factorial(n).divide(factorial(n.subtract(r)));
    }

    private static final BigInteger C(BigInteger n, BigInteger r) {
        return P(n, r).divide(factorial(r));
    }

    private static final BigInteger H(BigInteger n, BigInteger r) {
        return C(n.add(r.subtract(BigInteger.ONE)), r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(C(k, n).mod(MOD).intValue() == n < k ? 1 : k > n ? 0 : 1);
    }
}
```</s>
