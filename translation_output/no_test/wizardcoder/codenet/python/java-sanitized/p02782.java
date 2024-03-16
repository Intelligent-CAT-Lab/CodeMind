import java.util.*;
import java.math.*;

public class p02782 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10,9)+7;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for(int i=1;i<rng;i++){
            fctr[i] = (int) ((long) fctr[i-1]*i % mod);
        }
        int[][] dp = new int[rng][rng];
        for(int i=0;i<rng;i++){
            dp[i][0] = 1;
            dp[0][i] = 1;
        }
        for(int i=1;i<rng;i++){
            for(int j=1;j<rng;j++){
                dp[i][j] = (int) ((long) dp[i-1][j]*i % mod);
                dp[i][j] = (int) ((long) dp[i][j]*j % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i-1] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[j] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j-1] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+1] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+2] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+3] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+4] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+5] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+6] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+7] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+8] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+9] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+10] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+11] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+12] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+13] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+14] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+15] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+16] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+17] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+18] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+19] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+20] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+21] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+22] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+23] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+24] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+25] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+26] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+27] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+28] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+29] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+30] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+31] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+32] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+33] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+34] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+35] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+36] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+37] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+38] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+39] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+40] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+41] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+42] % mod);
                dp[i][j] = (int) ((long) dp[i][j]*fctr[i+j+4