Below is the translated Java code equivalent to the provided Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class HashCalculation {
    private static final int BASE = 100;
    private static final long MOD1 = 1_000_000_007L;
    private static final long MOD2 = 2_147_483_647L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        long acc1 = 0;
        long acc2 = 0;
        long[] hlst1 = new long[length + 1];
        long[] hlst2 = new long[length + 1];
        
        for (int index = 0; index < length; index++) {
            int i = s.charAt(index);
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst1[index + 1] = acc1;
            hlst2[index + 1] = acc2;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            long[] ha1 = calcHash(hlst1, hlst2, 0, alen, alen);
            long[] ha2 = calcHash(hlst1, hlst2, alen + blen, blen + alen * 2, alen);
            if (!compareHash(ha1, ha2)) continue;
            long[] ha3 = calcHash(hlst1, hlst2, blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!compareHash(ha1, ha3)) continue;
            long[] hb1 = calcHash(hlst1, hlst2, alen, alen + blen, blen);
            long[] hb2 = calcHash(hlst1, hlst2, blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!compareHash(hb1, hb2)) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    private static long[] calcHash(long[] hlst1, long[] hlst2, int left, int right, int xlen) {
        long hash1 = (hlst1[right] - hlst1[left] * BigInteger.valueOf(BASE).modPow(BigInteger.valueOf(xlen), BigInteger.valueOf(MOD1)).longValue() + MOD1) % MOD1;
        long hash2 = (hlst2[right] - hlst2[left] * BigInteger.valueOf(BASE).modPow(BigInteger.valueOf(xlen), BigInteger.valueOf(MOD2)).longValue() + MOD2) % MOD2;
        return new long[]{hash1, hash2};
    }

    private static boolean compareHash(long[] hash1, long[] hash2) {
        return hash1[0] == hash2[0] && hash1[1] == hash2[1];
    }
}
```

To compile and execute the code in a Java environment, save it to a file named `HashCalculation.java`, then compile with `javac HashCalculation.java`, and run with `java HashCalculation`. Enter the test input (e.g., "NicoNicoNi") when prompted, and the expected output "Love Nico!" should be displayed.
