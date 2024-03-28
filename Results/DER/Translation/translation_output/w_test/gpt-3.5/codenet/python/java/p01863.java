```java
import java.util.Scanner;

public class StringPatternMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        final int BASE = 100;
        final int MOD1 = 1000000007;
        final int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        int[] hlst1 = new int[length + 1];
        int[] hlst2 = new int[length + 1];

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            acc1 = (int) (((long) acc1 * BASE + ascii) % MOD1);
            acc2 = (int) (((long) acc2 * BASE + ascii) % MOD2);
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            int[] ha1 = calcHash(0, alen, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            int[] ha2 = calcHash(alen + blen, blen + alen * 2, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (ha1[0] != ha2[0] || ha1[1] != ha2[1]) continue;
            int[] ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (ha1[0] != ha3[0] || ha1[1] != ha3[1]) continue;
            int[] hb1 = calcHash(alen, alen + blen, blen, hlst1, hlst2, BASE, MOD1, MOD2);
            int[] hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (hb1[0] != hb2[0] || hb1[1] != hb2[1]) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    private static int[] calcHash(int left, int right, int xlen, int[] hlst1, int[] hlst2, int BASE, int MOD1, int MOD2) {
        int hash1 = (hlst1[right] - hlst1[left] * modPow(BASE, xlen, MOD1)) % MOD1;
        int hash2 = (hlst2[right] - hlst2[left] * modPow(BASE, xlen, MOD2)) % MOD2;
        if (hash1 < 0) hash1 += MOD1;
        if (hash2 < 0) hash2 += MOD2;
        return new int[]{hash1, hash2};
    }

    private static int modPow(int base, int exp, int mod) {
        long result = 1;
        long x = base;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            exp /= 2;
        }
        return (int) result;
    }
}
```

