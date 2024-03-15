Here is the Python code translated into Java:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class HashCalculation {
    private static final int BASE = 100;
    private static final BigInteger MOD1 = BigInteger.valueOf(1000000007);
    private static final BigInteger MOD2 = BigInteger.valueOf(2147483647);
    private static BigInteger[] hlst1;
    private static BigInteger[] hlst2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        hlst1 = new BigInteger[length + 1];
        hlst2 = new BigInteger[length + 1];
        hlst1[0] = BigInteger.ZERO;
        hlst2[0] = BigInteger.ZERO;

        for (int j = 0; j < length; j++) {
            char c = s.charAt(j);
            int i = c;
            acc1 = acc1.multiply(BigInteger.valueOf(BASE)).add(BigInteger.valueOf(i)).mod(MOD1);
            acc2 = acc2.multiply(BigInteger.valueOf(BASE)).add(BigInteger.valueOf(i)).mod(MOD2);
            hlst1[j + 1] = acc1;
            hlst2[j + 1] = acc2;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 == 1) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            BigInteger[] ha1 = calcHash(0, alen, alen);
            BigInteger[] ha2 = calcHash(alen + blen, blen + alen * 2, alen);
            if (!ha1[0].equals(ha2[0]) || !ha1[1].equals(ha2[1])) continue;
            BigInteger[] ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!ha1[0].equals(ha3[0]) || !ha1[1].equals(ha3[1])) continue;
            BigInteger[] hb1 = calcHash(alen, alen + blen, blen);
            BigInteger[] hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!hb1[0].equals(hb2[0]) || !hb1[1].equals(hb2[1])) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            System.exit(0);
        }
        System.out.println("mitomerarenaiWA");
    }

    private static BigInteger[] calcHash(int left, int right, int xlen) {
        BigInteger[] result = new BigInteger[2];
        result[0] = (hlst1[right].subtract(hlst1[left].multiply(pow(BASE, xlen, MOD1)))
                                  .mod(MOD1));
        result[1] = (hlst2[right].subtract(hlst2[left].multiply(pow(BASE, xlen, MOD2)))
                                  .mod(MOD2));
        return result;
    }

    private static BigInteger pow(int base, int exponent, BigInteger mod) {
        return BigInteger.valueOf(base).modPow(BigInteger.valueOf(exponent), mod);
    }
}
```

Please note:

1. In the Java code, I've used `BigInteger` to handle possible integer overflows and to provide the `modPow` function, which is analogous to Python's `pow` function with three arguments for modulo exponentiation.

2. I've replaced the `print` statement in the loop with `System.out.println` and included a `System.exit(0)` after the print statement to mimic the `break` in the Python `for-else` construct.

3. Since Java does not have an equivalent to Python's `for-else` construct, if the loop completes without finding a match that prints "Love", the final `mitomerarenaiWA` is printed outside the loop.

4. I've also replaced `input()` with usage of the `Scanner` class to read console input.

Remember to import the required classes (`Scanner` and `BigInteger`) before trying to run this code.
