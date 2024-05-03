import java.io.*;
import java.util.*;
import java.math.*;

public class p02826 {
    static final int MOD = (int)1e9 + 7;
    static final int U = (int)1e5;
    static BigInteger[] fact, fact_inv, inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        fact = new BigInteger[U+1];
        fact_inv = new BigInteger[U+1];
        inv = new BigInteger[U+1];

        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }

        fact_inv[U] = fact[U].modInverse(BigInteger.valueOf(MOD));
        for (int i = U-1; i >= 0; i--) {
            fact_inv[i] = fact_inv[i+1].multiply(BigInteger.valueOf(i+1)).mod(BigInteger.valueOf(MOD));
        }

        for (int i = 1; i <= U; i++) {
            inv[i] = fact[i-1].multiply(fact_inv[i]).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] f = new BigInteger[N+N+10];
        for (int x = 1; x <= N/2; x++) {
            for (int i = x; i <= N; i += x) {
                f[i] = f[i].add(BigInteger.valueOf(2).multiply(inv[1 + (i-1) / x])).mod(BigInteger.valueOf(MOD));
            }
        }