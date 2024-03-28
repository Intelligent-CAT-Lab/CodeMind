import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class p03375 {
    private static final int MAX_N = 1001; // Adjust as needed, assuming N<=1000 as Python version suggests
    private static BigInteger[][] B = new BigInteger[MAX_N][MAX_N];
    private static BigInteger[][] pow_2 = new BigInteger[MAX_N][MAX_N];
    private static BigInteger[] pow_pow = new BigInteger[MAX_N];
    private static BigInteger[] fact = new BigInteger[MAX_N];
    private static BigInteger[] fact_inv = new BigInteger[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger MOD = sc.nextBigInteger();

        // Initialize arrays with BigInteger
        for (int i = 0; i <= N; ++i) {
            for (int j = 0; j <= N; ++j) {
                B[i][j] = BigInteger.ZERO;
                pow_2[i][j] = BigInteger.ZERO;
            }
            pow_pow[i] = BigInteger.ZERO;
            fact[i] = BigInteger.ZERO;
            fact_inv[i] = BigInteger.ZERO;
        }

        B[0][0] = BigInteger.ONE;
        // ...