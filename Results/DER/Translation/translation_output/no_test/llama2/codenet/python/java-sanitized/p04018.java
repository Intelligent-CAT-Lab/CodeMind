import java.util.Arrays;
import java.util.List;

public class p04018 {
    public static void main(String[] args) {
        List<String> w = Arrays.asList(args[0].split(" "));
        int n = w.size();
        int t = -1;
        int[] zl = new int[n];
        int[] zr = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            zl[i] = 0;
            zr[i] = 0;
        }
        int c = 0;
        int f = 1;
        for (int i = 1; i < n; i++) {
            if (i + zl[i - c] < c + zl[c]) {
                zl[i] = zl[i - c];
            } else {
                int j = Math.max(0, c + zl[c] - i);
                while (i + j < n && w.get(i + j).equals(w.get(i))) {
                    j++;
                }
                zl[i] = j;
                c = i;
            }
        }
        for (int p = 1; p < n; p++) {
            for (int k = 2; k < zl[p] / p + 2; k++) {
                f[k * p - 1] = 0;
            }
        }
        for (int j = 1; j < n / 2 + 1; j++) {
            if (n % j == 0 && w.subList(0, n - j).equals(w.subList(j, n))) {
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