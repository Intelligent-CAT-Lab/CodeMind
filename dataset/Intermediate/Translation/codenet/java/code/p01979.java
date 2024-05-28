import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] numArr = sc.next().toCharArray();
        int length = numArr.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = numArr[i] - '0';
        }
        long[][][][][][] dp = new long[length + 1][10][10][10][10][2];
        dp[0][0][0][0][0][1] = 1;
        long[][] counts = new long[length + 1][2];
        for (int i = 1; i <= length; i++) {
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    for (int c = 0; c < 10; c++) {
                        for (int d = 0; d < 10; d++) {
                            for (int e = 0; e < 10; e++) {
                                dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][0];
                                if (e < arr[i - 1]) {
                                    dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][1];
                                } else if (e == arr[i - 1]) {
                                    dp[i][b][c][d][e][1] += dp[i - 1][a][b][c][d][1];
                                }
                            }
                        }
                    }
                }
            }
            for (int e = 0; e < 10; e++) {
                counts[i][0] += counts[i - 1][0];
                if (e < arr[i - 1]) {
                    counts[i][0] += counts[i - 1][1];
                } else if (e == arr[i- 1]) {
                    counts[i][1] += counts[i - 1][1];
                }
            }
            for (int j = 0; j < 10; j++) {
                counts[i][0] += dp[i][5][1][j][3][0];
                counts[i][1] += dp[i][5][1][j][3][1];
                dp[i][5][1][j][3][0] = 0;
                dp[i][5][1][j][3][1] = 0;
            }
        }
        System.out.println(counts[length][0] + counts[length][1]);
    }
}

