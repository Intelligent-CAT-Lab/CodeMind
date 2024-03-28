Here is the translated Java code based on your Python code:

```java
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final BigInteger BASE = BigInteger.valueOf(100);
    private static final BigInteger MOD1 = BigInteger.valueOf(1000000007);
    private static final BigInteger MOD2 = BigInteger.valueOf(2147483647);
    private static ArrayList<BigInteger> hlst1 = new ArrayList<>();
    private static ArrayList<BigInteger> hlst2 = new ArrayList<>();
    private static String s;
    private static int length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        length = s.length();
        BigInteger acc1 = BigInteger.ZERO;
        BigInteger acc2 = BigInteger.ZERO;
        hlst1.add(BigInteger.ZERO);
        hlst2.add(BigInteger.ZERO);

        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = acc1.multiply(BASE).add(BigInteger.valueOf(i)).mod(MOD1);
            acc2 = acc2.multiply(BASE).add(BigInteger.valueOf(i)).mod(MOD2);
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            BigInteger[] ha1 = calc_hash(0, alen, alen);
            BigInteger[] ha2 = calc_hash(alen + blen, blen + alen * 2, alen);
            if (!ha1[0].equals(ha2[0]) || !ha1[1].equals(ha2[1])) continue;
            BigInteger[] ha3 = calc_hash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!ha1[0].equals(ha3[0]) || !ha1[1].equals(ha3[1])) continue;
            BigInteger[] hb1 = calc_hash(alen, alen + blen, blen);
            BigInteger[] hb2 = calc_hash(blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!hb1[0].equals(hb2[0]) || !hb1[1].equals(hb2[1])) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    private static BigInteger[] calc_hash(int left, int right, int xlen) {
        BigInteger val1 = hlst1.get(right).subtract(hlst1.get(left).multiply(BASE.pow(xlen)).mod(MOD1)).mod(MOD1);
        BigInteger val2 = hlst2.get(right).subtract(hlst2.get(left).multiply(BASE.pow(xlen)).mod(MOD2)).mod(MOD2);
        return new BigInteger[]{val1, val2};
    }
}
```

A few things have changed in the translation process:

1. Java does not have a built-in pair or tuple like Python, so I am using a `BigInteger[]` array to return the hash values.
2. I used Java's `BigInteger` class for arithmetic operations to handle large integer values and modulo operations just as the Python code uses arbitrary-precision integers.
3. I modified the print statement to match Java's `System.out.println` syntax and string concatenation.
4. I added `import` statements for the necessary classes.
5. Java uses `ArrayList` instead of Python's list, and for simplicity, I initialized the arrays with zeros for both hash lists using `BigInteger.ZERO`.
6. Python's `range` functionality is not built into Java, so the loops and if conditions were adapted accordingly.
