import java.util.*;

public class p01863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 10000000007;
        int MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        hlst1.add(0L);
        hlst2.add(0L);
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        long[] hash = new long[length + 1];
        for (int i = 0; i < length; i++) {
            hash[i + 1] = (hash[i] * BASE + s.charAt(i)) % MOD1;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2!= 0) {
                continue;
            }
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) {
                continue;
            }
            long ha1 = (hash[alen] - hash[0] * pow(BASE, alen, MOD1) + MOD1) % MOD1;
            long ha2 = (hash[alen + blen] - hash[alen] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            if (ha1!= ha2) {
                continue;
            }
            long ha3 = (hash[blen * 2 + alen * 2] - hash[blen * 2 + alen * 3] * pow(BASE, alen, MOD1) + MOD1) % MOD1;
            if (ha1!= ha3) {
                continue;
            }
            long hb1 = (hash[alen + blen] - hash[alen] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            long hb2 = (hash[blen * 2 + alen * 2] - hash[blen + alen * 2] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            if (hb1!= hb2) {
                continue;
            }
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        }
        if (true) {
            System.out.println("mitomerarenaiWA");
        }
    }

    public static long pow(int x, int n, int mod) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return result;
    }
}