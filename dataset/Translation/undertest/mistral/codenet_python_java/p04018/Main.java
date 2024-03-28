import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int n = w.length();
        int t = -1;
        int[] zl = new int[n];
        int[] zr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            zl[i] = zr[i] = 0;
        }

        for (int i = 1; i < n; i++) {
            if (i + zl[i - 1] < zl[i - 1] + zl[zl[i - 1] - 1]) {
                zl[i] = zl[i - 1];
            } else {
                int j = max(0, zl[i - 1] + zl[zl[i - 1] - 1] - i);
                while (i + j < n && w.charAt(i + j) == w.charAt(i)) {
                    j++;
                }
                zl[i] = j;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int k = 2; k <= zl[i] / i + 2; k++) {
                zr[i * k - 1] = 0;
            }
        }

        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.substring(0, n - j).equals(w.substring(j))) {
                t = j;
                break;
            }
        }

        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (zl[i] && zr[n - 2 - i]) {
                    cnt++;
                }
            }
            System.out.println(2);
            System.out.println(cnt);
        }
    }
}