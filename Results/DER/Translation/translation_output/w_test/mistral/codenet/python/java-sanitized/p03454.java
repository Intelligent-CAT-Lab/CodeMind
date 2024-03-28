import java.util.*;

public class p03454 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        long MOD = 1000000007;
        long ans = 0;

        // l has <= 7 digits
        for (int r = 1; r <= 9; r++) {
            long tot = r;
            for (int l = 1; l <= 9; l++) {
                tot += (l * 10) % MOD;
                if (tot >= S) {
                    ans++;
                    break;
                }
            }
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            long d = S / cnt;
            long m = S % cnt;
            if (d <= 7) {
                break;
            }
            if (m != 0) {
                ans++;
            } else {
                ans += (long) Math.pow(10, d, MOD) - (long) Math.pow(10, d - 1, MOD) - cnt + 1;
            }
            ans %= MOD;
        }

        System.out.println(ans % MOD);
    }
}