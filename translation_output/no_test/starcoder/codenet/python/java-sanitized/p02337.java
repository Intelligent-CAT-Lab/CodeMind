import java.util.*;
import java.io.*;

public class p02337 {
    static int mod = 1000000007;
    static int[][] star = new int[1001][1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i <= 1000; i++) {
            star[i][0] = 0;
            star[i][i] = 1;
        }
        for(int i = 1; i <= 1000; i++) {
            for(int j = 1; j <= i; j++) {
                star[i][j] = (star[i-1][j-1] + j * star[i-1][j]) % mod;
            }
        }
        int ans = 0;
        for(int i = 0; i <= k; i++) {
            ans = (ans + star[n][i]) % mod;
        }
        System.out.println(ans);
    }
}