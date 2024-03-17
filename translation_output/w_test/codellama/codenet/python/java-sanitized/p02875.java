import java.math.BigInteger;

public class p02875 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int P = 998244353;
        int nn = N + 10;

        BigInteger[] fa = new BigInteger[nn + 1];
        BigInteger[] fainv = new BigInteger[nn + 1];

        fa[0] = BigInteger.ONE;
        fainv[nn] = BigInteger.ONE;

        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(P));
            fainv[i - 1] = fainv[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(P));
        }

        BigInteger ans = BigInteger.valueOf(3).modPow(BigInteger.valueOf(N), BigInteger.valueOf(P));

        for (int i = N / 2 + 1; i <= N; i++) {
            BigInteger C = fa[N].multiply(fainv[i]).mod(BigInteger.valueOf(P)).multiply(fainv[N - i]).mod(BigInteger.valueOf(P));
            ans = ans.subtract(C.multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(P)));
        }

        System.out.println(ans.mod(BigInteger.valueOf(P)));
    }
}