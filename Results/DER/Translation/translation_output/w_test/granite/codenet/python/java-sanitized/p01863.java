import java.util.*;

public class p01863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        int[] hlst1 = new int[length + 1];
        int[] hlst2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int i1 = (int) c;
            acc1 = (acc1 * BASE + i1) % MOD1;
            acc2 = (acc2 * BASE + i1) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
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
            int[] ha1 = hash(hlst1, 0, alen, alen);
            int[] ha2 = hash(hlst1, alen + blen, blen + alen * 2, alen);
            if (!Arrays.equals(ha1, ha2)) {
                continue;
            }
            int[] ha3 = hash(hlst1, blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!Arrays.equals(ha1, ha3)) {
                continue;
            }
            int[] hb1 = hash(hlst1, alen, alen + blen, blen);
            int[] hb2 = hash(hlst1, blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!Arrays.equals(hb1, hb2)) {
                continue;
            }
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        }
        if (true) {
            System.out.println("mitomerarenaiWA");
        }
    }

    public static int[] hash(int[] hlst, int left, int right, int xlen) {
        int[] ret = new int[2];
        ret[0] = (hlst[right] - hlst[left] * (int) Math.pow(BASE, xlen) % MOD1 + MOD1) % MOD1;
        ret[1] = (hlst[right] - hlst[left] * (int) Math.pow(BASE, xlen) % MOD2 + MOD2) % MOD2;
        return ret;
    }
}