import java.util.Scanner;
import java.math.BigInteger;

public class p02738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        BigInteger M = new BigInteger(input[1]);

        int l = n * 3 + 1;
        BigInteger[][] d = new BigInteger[l][n * 5];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n * 5; j++) {
                d[i][j] = BigInteger.ZERO;
            }
        }
        d[0][0] = BigInteger.ONE;

        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            BigInteger jBI = BigInteger.valueOf(j);
            BigInteger kBI = BigInteger.valueOf(k);
            for (int p = 0; p < n * 5; p++) {
                d[i][p] = d[i - 3][Math.max(p - k, 0)].multiply(kBI);
                if (p + 1 < n * 5) {
                    d[i][p] = d[i][p].add(d[k][p + 1]);
                }
                d[i][p] = d[i][p].multiply(jBI);
                if (p > 0) {
                    d[i][p] = d[i][p].add(d[j][p - 1]);
                } else {
                    d[i][p] = d[i][p].add(d[j][n * 5 - 1]);
                }
                d[i][p] = d[i][p].mod(M);
            }
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < l; i++) {
            sum = sum.add(d[l - 1][i]);
        }
        sum = sum.mod(M);
        System.out.println(sum);
    }
}