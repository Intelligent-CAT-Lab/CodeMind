
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        String N = "0" + newVariable_0;
        int l = N.length();

        // 0 おつり, 1 ぴったり, 2 多く
        long[][] dp = new long[l + 1][3];

        dp[0][0] = dp[0][2] = 1;

        for (int i = 1; i < l; i++) {
var newVariable_1 = N.charAt(i);            int c = newVariable_1 - '0';
var newVariable_2 = Math.min(dp[i - 1][0], dp[i - 1][2]);            dp[i][0] = newVariable_2 + 9 - c;
var newVariable_3 = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);            dp[i][1] = newVariable_3 + c;
var newVariable_4 = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);            dp[i][2] = newVariable_4 + c + 1;
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
