Below is the Java translation of the given Python code. The Java program takes user input from the standard input, computes the desired output, and prints the result to the standard output.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final BigInteger P = BigInteger.valueOf(1000000007);
    private static BigInteger[] f;
    private static BigInteger[] invf;

    public static BigInteger fact(int n) {
        f = new BigInteger[n + 1];
        f[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f[i] = f[i - 1].multiply(BigInteger.valueOf(i)).mod(P);
        }
        return f[n];
    }

    public static BigInteger[] invFact(int n) {
        invf = new BigInteger[n + 1];
        invf[n] = f[n].modInverse(P);
        for (int i = n; i > 0; i--) {
            invf[i - 1] = invf[i].multiply(BigInteger.valueOf(i)).mod(P);
        }
        return invf;
    }

    public static BigInteger comb(int a, int b) {
        if (a < b || a < 0 || b < 0) return BigInteger.ZERO;
        return f[a].multiply(invf[b]).multiply(invf[a - b]).mod(P);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        fact(2 * n);
        invFact(2 * n);

        BigInteger ans = BigInteger.ZERO;

        BigInteger powA = BigInteger.ONE;
        BigInteger powB = BigInteger.ONE;
        BigInteger inv100 = BigInteger.valueOf(100).modInverse(P);
        BigInteger aBig = BigInteger.valueOf(a).multiply(inv100).mod(P);
        BigInteger bBig = BigInteger.valueOf(b).multiply(inv100).mod(P);
        BigInteger cBig = BigInteger.valueOf(c).multiply(inv100).mod(P);

        BigInteger invAB = aBig.add(bBig).modInverse(P);
        aBig = aBig.multiply(invAB).mod(P);
        bBig = bBig.multiply(invAB).mod(P);

        BigInteger powAn[] = new BigInteger[n + 1];
        BigInteger powBn[] = new BigInteger[n + 1];

        powAn[0] = BigInteger.ONE;
        powBn[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            powAn[i] = powAn[i - 1].multiply(aBig).mod(P);
            powBn[i] = powBn[i - 1].multiply(bBig).mod(P);
        }

        for (int m = n; m < 2 * n; m++) {
            ans = ans.add(comb(m - 1, n - 1)
                          .multiply(powAn[n].multiply(powBn[m - n])
                          .add(powAn[m - n].multiply(powBn[n])))
                          .multiply(BigInteger.valueOf(m)).mod(P));
        }

        ans = ans.multiply(BigInteger.ONE.subtract(cBig).modInverse(P)).mod(P);

        System.out.println(ans.mod(P));
    }
}
```
Ensure you have the proper permissions and environment setup to execute and compile Java programs. Run this program, provide the same input (`1 25 25 50`), and you should see the expected output (`2`).
