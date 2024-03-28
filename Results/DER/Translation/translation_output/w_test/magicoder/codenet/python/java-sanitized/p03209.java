import java.util.*;

public class p03209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        long[] l = new long[51];
        long[] p = new long[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i <= 50; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        long ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans += 1;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}