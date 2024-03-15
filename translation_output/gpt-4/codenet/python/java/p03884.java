Here is the equivalent Java code for the provided Python snippet, which includes the logic for calculating factorials, inverses, combinations, and generating a string based on the sequence rules defined in the original code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class PythonToJavaTranslation {
    private static final BigInteger MOD = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));
    private static final int SEG = 128;
    private static final String OT = "EESSTTIIVVAALL";
    private static BigInteger[] frac;
    private static BigInteger[] fraci;

    public static void main(String[] args) {
        initFrac(1341);
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        int[] L = new int[301];
        for (int i = 300; i >= 0; --i) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; ++j) {
                ci = ci.add(comb(j + i, i).multiply(BigInteger.valueOf(2).pow(j)));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        StringBuilder ans = new StringBuilder("F".repeat(K)).append("ESTIVAL");
        for (int l : L) {
            ans.insert(0, "F".repeat(l)).insert(l, OT);
        }

        System.out.println(ans.toString());
    }

    private static void initFrac(int limit) {
        frac = new BigInteger[limit];
        fraci = new BigInteger[limit];
        frac[1] = BigInteger.ONE;
        for (int i = 2; i < limit; ++i) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(MOD);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(MOD);
        for (int i = limit - 2; i >= 0; --i) {
            fraci[i] = BigInteger.valueOf(i + 1).multiply(fraci[i + 1]).mod(MOD);
        }
    }

    private static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(MOD);
    }
}
```

A few notes about the translation:

1. Java code is a lot more verbose than Python, especially due to type declarations and explicit array initializations.
2. Java does not feature operators like `//=` or `**`, so we use methods like `modInverse()` for the modular inverse and `pow()` for exponentiation.
3. The repeating of strings with an operator like `'F'*K` in Python is substituted with `"F".repeat(K)`.
4. BigInteger is used to handle the large numbers, which requires to work with methods such as `add()`, `multiply()`, `divide()`, and `mod()`, instead of operators like `+`, `*`, `/`, and `%`.
5. A `main` method is included, which corresponds to the entry point of the Java application, and uses a `Scanner` for input.
6. The Python list slice assignment syntax is transformed into a for-loop when handling the reverse computations for `frac` and `fraci`.
7. In Python, you can iterate backwards directly with the range function, but in Java, you have to create a loop that handles the negative steps manually.
