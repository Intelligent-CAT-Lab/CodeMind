```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int BASE = 100;
        long MOD1 = 1000000007;
        long MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        hlst1.add(0L);
        hlst2.add(0L);

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int asciiValue = (int) c;
            acc1 = (acc1 * BASE + asciiValue) % MOD1;
            acc2 = (acc2 * BASE + asciiValue) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            long[] ha1 = calcHash(0, alen, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            long[] ha2 = calcHash(alen + blen, blen + alen * 2, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (ha1[0] != ha2[0] || ha1[1] != ha2[1]) continue;
            long[] ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (ha1[0] != ha3[0] || ha1[1] != ha3[1]) continue;
            long[] hb1 = calcHash(alen, alen + blen, blen, hlst1, hlst2, BASE, MOD1, MOD2);
            long[] hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen, hlst1, hlst2, BASE, MOD1, MOD2);
            if (hb1[0] != hb2[0] || hb1[1] != hb2[1]) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    public static long[] calcHash(int left, int right, int xlen, List<Long> hlst1, List<Long> hlst2, int BASE, long MOD1, long MOD2) {
        long[] hash = new long[2];
        long h1 = (hlst1.get(right) - hlst1.get(left) * pow(BASE, xlen, MOD1, MOD1)) % MOD1;
        long h2 = (hlst2.get(right) - hlst2.get(left) * pow(BASE, xlen, MOD2, MOD2)) % MOD2;
        hash[0] = h1 < 0 ? h1 + MOD1 : h1;
        hash[1] = h2 < 0 ? h2 + MOD2 : h2;
        return hash;
    }

    public static long pow(int base, int exp, long mod, long MOD) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result = (result * base) % MOD;
        }
        return result;
    }
}
```

