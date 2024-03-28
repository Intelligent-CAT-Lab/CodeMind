<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
51

```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```
[/INST]
```java
import java.math.BigInteger;

public class Main {
    private static final BigInteger MAX = BigInteger.valueOf(1000000007);
    private static final int N, M;
    private static final BigInteger diff;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        diff = BigInteger.valueOf(N - M);
        if (diff.compareTo(BigInteger.ONE) > 0) {
            System.out.println(0);
        } else if (diff.compareTo(BigInteger.ZERO) == 0) {
            System.out.println(factorial(N).multiply(factorial(M)).multiply(BigInteger.valueOf(2)).mod(MAX));
        } else {
            System.out.println(factorial(N).multiply(factorial(M)).mod(MAX));
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```</s>
