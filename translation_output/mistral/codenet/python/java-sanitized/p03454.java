import java.util.*;

public class p03454 {
    static int range = 10000000;
    static int MOD = 1000000007;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l <= range; l++) {
            while (tot < S) {
                r++;
                tot += l;
            }
            if (tot == S) {
                ans++;
            }
            tot -= l;
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) {
                break;
            }
            if (m != 0) {
                ans++;
            } else {
                ans += (int) Math.pow(10, d, MOD) - (int) Math.pow(10, d - 1, MOD) - cnt + 1;
                ans %= MOD;
            }
        }

        System.out.println(ans % MOD);
    }
}