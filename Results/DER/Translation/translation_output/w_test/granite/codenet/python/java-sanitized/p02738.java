import java.util.*;

public class p02738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i][0] = ((d[i - 3][0] * k + d[k][n * 4]) * j + d[j][1]) % M;
            for (int m = 1; m < n * 5; m++) {
                d[i][m] = d[i][m - 1];
            }
            d[i][n * 4] = d[i - 3][0];
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n * 5; j++) {
                sum += d[i][j];
                sum %= M;
            }
        }
        System.out.println(sum);
    }
}