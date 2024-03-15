import java.util.*;
import java.math.*;

public class p02878 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = 998244353;
        int P = N + 1;
        BigInteger f = BigInteger.ONE;
        BigInteger[] F = new BigInteger[P];
        BigInteger[] I = new BigInteger[P];
        F[0] = BigInteger.ONE;
        I[0] = BigInteger.ONE;
        long z = 0;

        for (int n = 1; n < P; n++) {
            f = f.multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(M));
            F[n] = f;
        }

        I[N] = f.modInverse(BigInteger.valueOf(M));
        BigInteger i = I[N];

        for (int n = N; n > 1; n--) {
            i = i.multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(M));
            I[n - 1] = i;
        }

        for (int k = 0; k <= (N - B - A > 0 ? Math.min(A + 1, N - B) : A); k++) {
            int Q = N - B - k - 1;
            BigInteger comb1 = F[B + k - 1].multiply(I[B]).multiply(I[k]).mod(BigInteger.valueOf(M));
            BigInteger comb2 = F[Q + A - k].multiply(I[Q]).multiply(I[A - k]).mod(BigInteger.valueOf(M));
            z += (long)((B - k) * comb