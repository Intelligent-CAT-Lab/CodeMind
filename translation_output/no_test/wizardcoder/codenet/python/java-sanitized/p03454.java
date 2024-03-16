import java.util.*;
import java.math.*;

public class p03454 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        int ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l <= 10000000; l++) {
            while (tot < S) {
                r++;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans++;
            tot -= String.valueOf(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m!= 0) ans++;
            else {
                ans += (int) Math.pow(10, d) - (int) Math.pow(10, d-1) - cnt + 1;
                ans %= MOD;
            }
        }
        System.out.println(ans % MOD);
    }
}