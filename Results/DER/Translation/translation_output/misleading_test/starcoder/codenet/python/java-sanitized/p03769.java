import java.util.*;

public class p03769 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fact = new int[101];
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }
        int[][] dp = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }

        int[][] dp2 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp2[i][j] = dp2[i - 1][j] + dp2[i - 1][j - 1] + dp[i][j];
            }
        }

        int[][] dp3 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp3[i][j] = dp3[i - 1][j] + dp3[i - 1][j - 1] + dp2[i][j];
            }
        }

        int[][] dp4 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp4[i][j] = dp4[i - 1][j] + dp4[i - 1][j - 1] + dp3[i][j];
            }
        }

        int[][] dp5 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp5[i][j] = dp5[i - 1][j] + dp5[i - 1][j - 1] + dp4[i][j];
            }
        }

        int[][] dp6 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp6[i][j] = dp6[i - 1][j] + dp6[i - 1][j - 1] + dp5[i][j];
            }
        }

        int[][] dp7 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp7[i][j] = dp7[i - 1][j] + dp7[i - 1][j - 1] + dp6[i][j];
            }
        }

        int[][] dp8 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp8[i][j] = dp8[i - 1][j] + dp8[i - 1][j - 1] + dp7[i][j];
            }
        }

        int[][] dp9 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp9[i][j] = dp9[i - 1][j] + dp9[i - 1][j - 1] + dp8[i][j];
            }
        }

        int[][] dp10 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp10[i][j] = dp10[i - 1][j] + dp10[i - 1][j - 1] + dp9[i][j];
            }
        }

        int[][] dp11 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp11[i][j] = dp11[i - 1][j] + dp11[i - 1][j - 1] + dp10[i][j];
            }
        }

        int[][] dp12 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp12[i][j] = dp12[i - 1][j] + dp12[i - 1][j - 1] + dp11[i][j];
            }
        }

        int[][] dp13 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp13[i][j] = dp13[i - 1][j] + dp13[i - 1][j - 1] + dp12[i][j];
            }
        }

        int[][] dp14 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp14[i][j] = dp14[i - 1][j] + dp14[i - 1][j - 1] + dp13[i][j];
            }
        }

        int[][] dp15 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp15[i][j] = dp15[i - 1][j] + dp15[i - 1][j - 1] + dp14[i][j];
            }
        }

        int[][] dp16 = new int[101][101];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                dp16[i][j] = dp16[i - 1][j] + dp16[i - 1][j - 1] + dp15[i][j];