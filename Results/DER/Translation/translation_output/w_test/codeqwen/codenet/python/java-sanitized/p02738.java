import java.util.Arrays;
import java.util.Scanner;

public class p02738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + Arrays.stream(d[k]).skip(1).sum()) * j + Arrays.stream(d[j]).skip(1).sum();
                d[i][m] %= M;
            }
        }
        System.out.println(Arrays.stream(d[l - 1]).sum() % M);
    }
}