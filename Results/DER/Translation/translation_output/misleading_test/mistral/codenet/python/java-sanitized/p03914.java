import java.util.*;

public class p03914 {
    final static int mod = 1000000007;
    final static double eps = 1e-9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            if (N == 0 && M == 0)
                break;
            double[][] dp = new double[N + 1][N + 1];
            Arrays.fill(dp[0],