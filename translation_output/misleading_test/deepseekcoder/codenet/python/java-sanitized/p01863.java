import java.util.Scanner;

public class p01863 {
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
            int c = (int) s.charAt(i);
            acc1 = (acc1 * BASE + c) % MOD1;
            acc2 = (acc2 * BASE + c) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            if (!calcHash(hlst1, alen, alen).equals(calcHash(hlst1, alen + blen, alen))) continue;
            if (!calcHash(hlst1, blen + alen * 2, alen).equals(calcHash(hlst1, blen * 2 + alen * 2, alen))) continue;
            if (!calcHash(hlst1, alen, alen + blen).equals(calcHash(hlst1, blen + alen * 2, blen))) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    private static Pair calcHash(int[] hlst, int left, int right) {
        return new Pair((hlst[right] - hlst[left] * pow(BASE, right - left, MOD1)) % MOD1,
                (hlst[right] - hlst[left] * pow(BASE, right - left, MOD2)) % MOD2);
    }

    private static int pow(int a, int b, int m) {
        int result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return result;
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair pair = (Pair) obj;
            return first == pair.first && second == pair.second;
        }
    }
}