import java.math.BigInteger;
import java.util.Scanner;

public class p03257 {
    public static void main(String[] args) {
        final int U = 100000;
        boolean[] isPrime = new boolean[U+1];
        for (int i = 2; i <= U; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p*p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        final int MM = 510;
        final int M = 255;
        BigInteger[][] A = new BigInteger[MM][MM];
        for (int n = 0; n < MM; n++) {
            for (int m = 0; m < MM; m++) {
                A[n][m] = BigInteger.ONE;
            }
        }
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                // Implementation of the even indexed rows
            } else {
                // Implementation of the odd indexed rows
            }
        }

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}