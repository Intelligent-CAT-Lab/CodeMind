import java.util.*;
import java.math.*;

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
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + d[k][(m + 1) % (n * 5)]) * j + d[j][(m + n * 5 - 1) % (n * 5)];
                d[i][m] %= M;
            }
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[l - 1][i];
            sum %= M;
        }
        System.out.println(sum);
    }
}