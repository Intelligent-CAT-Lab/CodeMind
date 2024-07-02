
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        String N = "0" + sc.next();
System.out.println("[INST]10;None;sc.next();"+sc.next());
        int l = N.length();
System.out.println("[INST]11;l;N.length();"+l);

        // 0 おつり, 1 ぴったり, 2 多く
        long[][] dp = new long[l + 1][3];

        dp[0][0] = dp[0][2] = 1;

        for (int i = 1; i < l; i++) {
            int c = N.charAt(i) - '0';
System.out.println("[INST]19;None;N.charAt(i);"+N.charAt(i));
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][2]) + 9 - c;
System.out.println("[INST]20;None;Math.min(dp[i - 1][0], dp[i - 1][2]);"+Math.min(dp[i - 1][0], dp[i - 1][2]));
            dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]) + c;
System.out.println("[INST]21;None;Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);"+Math.min(dp[i - 1][0] + 1, dp[i - 1][1]));
            dp[i][2] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1;
System.out.println("[INST]22;None;Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);"+Math.min(dp[i - 1][0] + 1, dp[i - 1][1]));
        }
//        debug(dp);
        dp[l - 1][0] += 1;
        System.out.println(Math.min(dp[l - 1][0], Math.min(dp[l - 1][1], dp[l - 1][2])));

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
