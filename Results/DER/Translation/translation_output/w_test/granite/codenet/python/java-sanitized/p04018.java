import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int t = -1;
        int[] z = new int[n];
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
            boolean[] f = new boolean[n];
            for (int i = 1; i < n; i++) {
                for (int j = 2; j <= z[i] / i + 1; j++) {
                    f[j * i - 1] = false;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (z[i] > 0 && z[n - 2 - i] > 0) {
                    f[i] = true;
                    f[n - 2 - i] = true;
                }
            }
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (f[i]) {
                    cnt++;
                }
            }
            System.out.println("2");
            System.out.println(cnt);
        }
    }
}