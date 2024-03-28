import java.util.*;
import java.math.BigInteger;

public class p03581 {
    static final int MOD = (int)Math.pow(10, 9) + 7;
    static final int U = 2001;
    static BigInteger[][] comb = new BigInteger[U][U];
    static BigInteger[][] S = new BigInteger[U][U];

    static void preprocess() {
        for(int i = 0; i < U; i++)
            Arrays.fill(comb[i], BigInteger.ZERO);
        comb[0][0] = BigInteger.ONE;
        for(int n = 1; n < U; n++) {
            comb[n][0] = comb[n-1][0];
            for(int k = 1; k <= n; k++)
                comb[n][k] = comb[n-1][k].add(comb[n-1][k-1]);
            for(int k = 0; k <= n; k++)
                comb[n][k] = comb[n][k].mod(BigInteger.valueOf(MOD));
        }

        for(int i = 0; i < U; i++)
            Arrays.fill(S[i], BigInteger.ZERO);
        S[0] = Arrays.copyOf(comb[0], U);
        for(int n = 1; n < U; n++) {
            S[n][0] = comb[n][0];
            for(int k = 1; k < U; k++)
                S[n][k] = S[n-1][k].add(S[n-1][k-1]);
            for(int k = 0; k < U; k++)
                S[n][k] = S[n][k].mod(BigInteger.valueOf(MOD));
        }
    }

    public static void main(String[] args) {
        preprocess();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        BigInteger x = BigInteger.ZERO;
        for(int k = 0; k <= A; k++) {
            x = x.add(comb[B-1][k].multiply(S[k][A-k]));
        }
        x = x.mod(BigInteger.valueOf(MOD));
        System.out.println(x);
    }
}