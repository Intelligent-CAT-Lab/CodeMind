Here is the translation of the given Python code to Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    private static final int P = 998244353;
    private static BigInteger[] fa;
    private static BigInteger[] fainv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int nn = N + 10;
        fa = new BigInteger[nn + 1];
        fainv = new BigInteger[nn + 1];

        fa[0] = BigInteger.ONE;
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(P));
        }

        fainv[nn] = fa[nn].modPow(BigInteger.valueOf(P - 2), BigInteger.valueOf(P));
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(P));
        }

        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), BigInteger.valueOf(P));
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = ans.subtract(
                BigInteger.valueOf(2)
                        .multiply(C(N, i))
                        .multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N - i), BigInteger.valueOf(P)))
                        .mod(BigInteger.valueOf(P))
            ).mod(BigInteger.valueOf(P));
        }

        System.out.println(ans);
        sc.close();
    }

    private static BigInteger C(int a, int b) {
        if (0 <= b && b <= a) {
            return fa[a].multiply(fainv[b]).mod(BigInteger.valueOf(P))
                        .multiply(fainv[a - b]).mod(BigInteger.valueOf(P));
        }

        return BigInteger.ZERO;
    }
}
```
This Java implementation assumes that the input is entered in the exact same manner as the Python code, with an integer input from the console. Note that to achieve the functionality provided by Python's built-in `pow` method with modular arithmetic, the Java `BigInteger` class's `modPow` method is used.

Remember to add exception handling or validation, as needed, especially when dealing with user inputs.
