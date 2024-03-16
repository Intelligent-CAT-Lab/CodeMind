import java.util.Scanner;

public class p01863 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
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

    for (int i = length / 3; i >= 0; i--) {
      if ((length - (i + 1) * 3) % 2 == 0) {
        int alen = i + 1;
        int blen = (length - (i + 1) * 3) / 2;
        if (blen <= 0) {
          continue;
        }
        int ha1 = calcHash(0, alen, alen, hlst1);
        int ha2 = calcHash(alen + blen, blen + alen * 2, alen, hlst1);
        if (ha1 != ha2) {
          continue;
        }
        int ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen, hlst1);
        if (ha1 != ha3) {
          continue;
        }
        int hb1 = calcHash(alen, alen + blen, blen, hlst2);
        int hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen, hlst2);
        if (hb1 != hb2) {
          continue;
        }
        System.out.println("Love " + s.substring(0, i + 1 + blen));
        break;
      }
    }
    if (i == -1) {
      System.out.println("mitomerarenaiWA");
    }
  }

  private static int calcHash(int left, int right, int xlen, int[] hlst) {
    return ((hlst[right] - hlst[left] * pow(BASE, xlen, MOD1)) % MOD1,
            (hlst[right] - hlst[left] * pow(BASE, xlen, MOD2)) % MOD2);
  }
}