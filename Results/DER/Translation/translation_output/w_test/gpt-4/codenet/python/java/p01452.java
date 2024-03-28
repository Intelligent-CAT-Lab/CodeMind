Here's the translated Java code based on the provided Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    static final int MOD = 1000000007;
    static final int CMS = 1000000;
    static BigInteger[] cm = new BigInteger[CMS];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        // Initialization of factorials
        combInit();

        while (true) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();

            if (n == 0) {
                break;
            }

            result.append(f(n, m, k)).append('\n');
            break;
        }

        System.out.print(result.toString());
        input.close();
    }

    public static void combInit() {
        cm[0] = BigInteger.ONE;
        for (int i = 1; i < CMS; i++) {
            cm[i] = cm[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
    }

    public static BigInteger comb(int a, int b) {
        return cm[a].multiply(inv(cm[a - b]).multiply(inv(cm[b])).mod(BigInteger.valueOf(MOD)));
    }

    public static BigInteger inv(BigInteger x) {
        return x.modInverse(BigInteger.valueOf(MOD));
    }

    public static BigInteger f(int n, int m, int k) {
        BigInteger r = BigInteger.ZERO;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            BigInteger mt = comb(n + m + k * 2, n + i * 2);
            BigInteger lk = BigInteger.ONE;
            BigInteger rk = BigInteger.ONE;
            if (i > 0) {
                lk = comb(n + i * 2, i).subtract(comb(n + i * 2, i - 1)).mod(BigInteger.valueOf(MOD));
            }
            if (j > 0) {
                rk = comb(m + j * 2, j).subtract(comb(m + j * 2, j - 1)).mod(BigInteger.valueOf(MOD));
            }
            r = r.add(mt.multiply(lk).multiply(rk)).mod(BigInteger.valueOf(MOD));
        }

        return r;
    }
}
```

This Java code uses the `BigInteger` class to handle the factorial computations and modular arithmetic necessary for this problem. The `Scanner` class is used to read input, and the `StringBuilder` is used for efficiently constructing the output string which contains results of the computations. Please ensure that you provide the input in the same way as it's mentioned in the test case, as Java reads input during runtime.
