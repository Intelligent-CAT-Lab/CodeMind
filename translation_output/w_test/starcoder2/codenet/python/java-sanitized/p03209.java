import java.util.*;

public class p03209 {
    static int N, X;
    static int[] l = new int[51];
    static int[] p = new int[51];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();

        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

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