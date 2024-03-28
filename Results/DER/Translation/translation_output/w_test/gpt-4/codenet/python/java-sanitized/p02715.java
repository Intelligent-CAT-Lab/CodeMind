import java.util.Scanner;
import java.math.BigInteger;

public class p02715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = 1000000007;

        BigInteger[] X = new BigInteger[K + 1];
        for (int i = 0; i <= K; i++) {
            X[i] = BigInteger.ZERO;
        }

        BigInteger ans = BigInteger.ZERO;
        for (int i = 1; i <= K; i++) {
            X[i] = X[i].add(BigInteger.valueOf(i));
            for (int j = i * 2; j <= K; j += i) {
                X[j] = X[j].subtract(X[i]);
            }
            ans = ans.add(X[i].multiply(BigInteger.valueOf(K / i).modPow(BigInteger.valueOf(N), BigInteger.valueOf(P))));
        }

        System.out.println(ans.mod(BigInteger.valueOf(P)));
        scanner.close();
    }
}