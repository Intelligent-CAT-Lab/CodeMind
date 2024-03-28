import java.io.*;
import java.util.*;
import java.math.*;

public class p02965 {
    private static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] finvs = modInvs(factorials, MOD);

        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = M % 2; i <= M; i += 2) {
            odds.add(i);
        }

        BigInteger c1 = BigInteger.ZERO;
        BigInteger c2 = BigInteger.ZERO;

        for (int odd : odds) {
            int halves = (M * 3 - odd) / 2;
            BigInteger oc1 = ncr(N, odd, factorials, finvs, MOD);
            BigInteger oc2 = ncr(N - 1, odd, factorials, finvs, MOD);

            BigInteger ncrValue = ncr(halves + N - 1, N - 1, factorials, finvs, MOD);
            c1 = c