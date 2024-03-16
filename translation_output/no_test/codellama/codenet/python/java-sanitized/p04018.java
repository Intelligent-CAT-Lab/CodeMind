import java.util.Scanner;

public class p04018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        int n = w.length();
        int t = -1;

        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.substring(0, n - j).equals(w.substring(j))) {
                t = j;
                break;
            }
        }

        if (t == -1) {
            System.out.println("1");
            System.out.println("1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println("1");
        } else {
            int[] zl = Z(w);
            String wReversed = new StringBuilder(w).reverse().toString();
            int[] zr = Z(wReversed);
            int cnt = 0;

            for (int i = 0; i < n - 1; i++) {
                if (zl[i] && zr[n - 2 - i]) {
                    cnt++;
                }
            }

            System.out.println("2");
            System.out.println(cnt);
        }
    }

    private static int[] Z(String s) {
        int m = s.length();
        int[] z = new int[m];
        int c = 0;
        int[] f = new int[m];

        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
                    j++;
                }
                z[i] = j;
                c = i;
            }
        }

        for (int p = 1; p < m; p++) {
            for (int k = 2; k < z[p] / p + 2; k++) {
                f[k * p - 1] = 0;
            }
        }

        return f;
    }
}