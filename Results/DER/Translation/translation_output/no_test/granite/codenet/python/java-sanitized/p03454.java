import java.util.*;
import java.io.*;

public class p03454 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int MOD = (int)Math.pow(10, 9) + 7;
        int ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 100000000; l++) {
            while (tot < S) {
                r += 1;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans += 1;
            tot -= String.valueOf(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m!= 0) ans += 1;
            else ans += (int)Math.pow(10, d) - (int)Math.pow(10, d-1) - cnt + 1;
            ans %= MOD;
        }
        System.out.println(ans % MOD);
    }
}