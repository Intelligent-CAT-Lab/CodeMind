import java.util.Scanner;

public class p01863 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        int[] hlst1 = new int[length + 1];
        int[] hlst2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
            int c = s.charAt(i);
            acc1 = (acc1 * BASE + c) % MOD1;
            acc2 = (acc2 * BASE + c) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }

        int[] calc_hash(int left, int right, int xlen) {
            int[] hash = new int[2];
            hash[0] = (hlst1[right] - hlst1[left] * (int) Math.pow(BASE, xlen) % MOD1 + MOD1) % MOD1;
            hash[1] = (hlst2[right] - hlst2[left] * (int) Math.pow(BASE, xlen) % MOD2 + MOD2) % MOD2;
            return hash;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            int[] ha1 = calc_hash(0, alen, alen);
            int[] ha2 = calc_hash(alen + blen, blen + alen * 2, alen);
            if (ha1[0] != ha2[0] || ha1[1] != ha2[1]) continue;
            int[] ha3 = calc_hash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (ha1[0] != ha3[0] || ha1[1] != ha3[1]) continue;
            int[] hb1 = calc_hash(alen, alen + blen, blen);
            int[] hb2 = calc_hash(blen + alen * 2, blen * 2 + alen * 2, blen);
            if (hb1[0] != hb2[0] || hb1[1] != hb2[1]) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        }
    }
}