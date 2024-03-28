import java.math.BigInteger;
import java.util.Scanner;

public class p02875 {
    static final BigInteger P = BigInteger.valueOf(998244353);
    static BigInteger[] fa, fainv;

    static BigInteger C(int a, int b) {
        if (b <= a && b >= 0) {
            return fa[a].multiply(fainv[b]).multiply(fainv[a-b]).mod(P);
        } else {
            return BigInteger.ZERO;
        }
    }

    static void init(int nn) {
        fa = new BigInteger[nn+1];
        fainv = new BigInteger[nn+1];
        fa[0] = BigInteger.ONE;
        fainv[0] = BigInteger.ONE;
        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i-1].multiply(BigInteger.valueOf(i)).mod(P);
        }
        fainv[nn] = fa[nn].modInverse(P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = fainv[i+1].multiply(BigInteger.valueOf(i+1)).mod(P);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int nn = N + 10;
        init(nn);

        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = ans.subtract(BigInteger.TWO.multiply(C(N, i)).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N - i), P))).mod(P);
        }

        System.out.println(ans);
    }
}