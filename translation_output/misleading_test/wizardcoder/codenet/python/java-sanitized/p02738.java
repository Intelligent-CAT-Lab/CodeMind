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
            for (int x = 0; x < n * 5; x++) {
                d[i][x] = ((d[i - 3][x] * k + d[k][(x - 1 + n * 5) % (n * 5)]) * j + d[j][(x + 1) % (n * 5)]) % M;
            }
        }
        long sum = 0;
        for (int x = 0; x < n * 5; x++) {
            sum += d[l - 1][x];
            sum %= M;
        }
        System.out.println(sum);
    }
}