import java.math.BigInteger;
import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int nn = N + 10;
        BigInteger P = BigInteger.valueOf(998244353);

        BigInteger[] fa = new BigInteger[nn+1];
        BigInteger[] fainv = new BigInteger[nn+1];
        fa[0] = BigInteger.ONE;
        fainv[0] = BigInteger.ONE;
        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i-1].multiply(BigInteger.valueOf(i)).mod(P);
        }
        fainv[nn] = fa[nn].modInverse(P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = fainv[i+1].multiply(BigInteger.valueOf(i+1)).mod(P);
        }
        BiFunction<Integer, Integer, BigInteger> C = (a, b) -> {
            if (b < 0 || b > a) {
                return BigInteger.ZERO;
            }
            return fa[a].multiply(fainv[b]).mod(P).multiply(fainv[a-b]).mod(P);
        };

        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = ans.subtract(C.apply(N, i).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N - i), P)).mod(P)).mod(P);
        }

        System.out.println(ans);
    }
}