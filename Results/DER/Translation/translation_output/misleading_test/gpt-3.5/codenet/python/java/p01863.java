```java
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        final int BASE = 100;
        final int MOD1 = 1000000007;
        final int MOD2 = 2147483647;
        int acc1 = 0, acc2 = 0;
        List<Integer> hlst1 = new ArrayList<>();
        List<Integer> hlst2 = new ArrayList<>();
        hlst1.add(0);
        hlst2.add(0);

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int ascii = c;
            acc1 = (acc1 * BASE + ascii) % MOD1;
            acc2 = (acc2 * BASE + ascii) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            long[] ha1 = calcHash(hlst1, hlst2, 0, alen, BASE, MOD1, MOD2);
            long[] ha2 = calcHash(hlst1, hlst2, alen + blen, alen, BASE, MOD1, MOD2);
            if (ha1[0] != ha2[0] || ha1[1] != ha2[1]) continue;
            long[] ha3 = calcHash(hlst1, hlst2, blen * 2 + alen * 2, alen, BASE, MOD1, MOD2);
            if (ha1[0] != ha3[0] || ha1[1] != ha3[1]) continue;
            long[] hb1 = calcHash(hlst1, hlst2, alen, blen, BASE, MOD1, MOD2);
            long[] hb2 = calcHash(hlst1, hlst2, blen + alen * 2, blen, BASE, MOD1, MOD2);
            if (hb1[0] != hb2[0] || hb1[1] != hb2[1]) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    public static long[] calcHash(List<Integer> hlst1, List<Integer> hlst2, int left, int right, int xlen, int BASE, int MOD) {
        long hash1 = (hlst1.get(right) - (long) hlst1.get(left) * pow(BASE, xlen, MOD)) % MOD;
        long hash2 = (hlst2.get(right) - (long) hlst2.get(left) * pow(BASE, xlen, MOD)) % MOD;
        return new long[] { hash1, hash2 };
    }

    public static long pow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
```

