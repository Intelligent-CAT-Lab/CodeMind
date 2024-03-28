import java.util.*;
import java.io.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2*10**3;
    static int[][] g1 = new int[N+1][N+1]; // å
ãã¼ãã«
    static int[][] g2 = new int[N+1][N+1]; //éå
ãã¼ãã«
    static int[][] inverse = new int[N+1][N+1]; //éå
ãã¼ãã«è¨ç®ç¨ãã¼ãã«
    static int[][][] dp = new int[N+1][N+1][N+1];
    static int[][][] dpf = new int[N+1][N+1][N+1];
    static int[][][] data = new int[N+1][N+1][N+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int N = S.length();
        //System.out.println(N);
        if (N==1) {
            System.exit(0);
        }
        for (int i = 0; i < N; i++) {
            S = S.substring(0, i) + S.substring(i+1);
            //System.out.println(S);
            if (S.charAt(0)=='0') {
                data[i+1][1][0]=1;
            }
            if (S.charAt(1)=='0') {
                data[i+1][1][0]=1;
            }
            if (S.charAt(0)=='1') {
                data[i+1][0][1]=1;
            }
            if (S.charAt(1)=='1') {
                data[i+1][0][1]=1;
            }
        }
        data[0][0][0]=1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= i; k++) {
                    if (data[i][j][k]==0) {
                        continue;
                    }
                    for (int a = 0; a <= j; a++) {
                        for (int b = 0; b <= k; b++) {
                            if (a==0 && b==0) {
                                continue;
                            }
                            if (a==0) {
                                dp[i+1][j][k]=