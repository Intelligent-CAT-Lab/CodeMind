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
            comb[n] = comb[n-1].add(comb[n-1].shiftRight(1));
            comb[n] = comb[n].mod(BigInteger.valueOf(MOD));
        }

        S[0] = new BigInteger[U];
        Arrays.fill(S[0], BigInteger.ONE);
        for(int n = 1; n < U; n++) {
            S[n] = comb[n-1].cumulativeSum();
            S[n] = Arrays.copyOf(S[n-1], U);
            S[n] = Arrays.stream(S[n]).map(x -> x.mod(BigInteger.valueOf(MOD))).toArray(BigInteger[]::new);
        }
    }

    static BigInteger[] cumulativeSum(BigInteger[] arr) {
        BigInteger[] cumSum = new BigInteger[arr.length];
        cumSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
            cumSum[i] = cumSum[i-1].add(arr[i]).mod(BigInteger.valueOf(MOD));
        return cumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        preprocess();
        BigInteger x = BigInteger.ZERO;
        for(int k = 0; k <= A; k++) {
            x = x.add(comb[B-1][k].multiply(S[k][A-k]));
            x = x.mod(BigInteger.valueOf(MOD));
        }
        System.out.println(x);
    }
}