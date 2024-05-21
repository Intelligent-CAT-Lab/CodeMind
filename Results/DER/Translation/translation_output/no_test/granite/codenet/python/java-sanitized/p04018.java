import java.util.*;
public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int t = -1;
        int[] z = new int[n];
        boolean[] f = new boolean[n];
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0 && s.substring(0, n - i).equals(s.substring(i, n))) {
                t = i;
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
            z[0] = n;
            int c = 0;
            for (int i = 1; i < n; i++) {
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
            for (int p = 1; p < n; p++) {
                for (int k = 2; k < z[p] / p + 2; k++) {
                    f[k * p - 1] = false;
                }
            }
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (z[i] > 0 && z[n - 1 - i] > 0) {
                    cnt++;
                }
            }
            System.out.println("2");
            System.out.println(cnt);
        }
    }
}