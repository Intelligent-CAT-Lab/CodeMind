import java.util.*;
import java.math.BigInteger;

public class p04004 {
    static final BigInteger MOD = BigInteger.valueOf((long) (1e9 + 7));
    static final int U = (int) (1e6);
    static BigInteger[] fact, factInv;
    static BigInteger[] power2, power2Inv, power3, power3Inv;

    static void cumprod(BigInteger[] arr, int L, BigInteger MOD) {
        int Lsq = (int) Math.sqrt(L) + 1;
        for (int n = 1; n < Lsq; ++n) {
            arr[n] = arr[n].multiply(arr[n - 1]).mod(MOD);
        }
        for (int n = 1; n < Lsq; ++n) {
            arr[n * Lsq] = arr[n * Lsq].multiply(arr[(n - 1) * Lsq]).mod(MOD);
        }
        for (int n = 1; n < L; ++n) {
            arr[n] = arr[n].multiply(arr[arr.length - 1]).mod(MOD);
        }
    }

    static void makeFact(int U, BigInteger MOD) {
        fact = new BigInteger[U + 1];
        factInv = new BigInteger[U + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= U; ++i) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        factInv[U] = fact[U].modInverse(MOD);
        for (int i = U - 1; i >= 0; --i) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
    }

    static void makePower(BigInteger a, int L, BigInteger MOD) {
        power2 = new BigInteger[L];
        power2Inv = new BigInteger[L];
        power3 = new BigInteger[L];
        power3Inv = new BigInteger[L];
        power2[0] = BigInteger.ONE;
        power3[0] = BigInteger.ONE;
        for (int i = 1; i < L; ++i) {
            power2[i] = power2[i - 1].multiply(a).mod(MOD);
            power3[i] = power3[i - 1].multiply(a).mod(MOD);
        }
        power2Inv[0] = power2[0].modInverse(MOD);
        power3Inv[0] = power3[0].modInverse(MOD);
        for (int i = 1; i < L; ++i) {
            power2Inv[i] = power2Inv[i - 1].multiply(a).mod(MOD);
            power3Inv[i] = power3Inv[i - 1].multiply(a).mod(MOD);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        makeFact(U, MOD);
        makePower(BigInteger.valueOf(2), U, MOD);
        BigInteger[] x = new BigInteger[N + M + 1];
        x[1] = BigInteger.ONE;
        for (int i = 2; i <= N + M; ++i) {
            x[i] = power2[i - 1].multiply(power3Inv[K + i - 1]).mod(MOD);
        }
        for (int i = 1; i <= N + M; ++i) {
            x[i] = x[i].multiply(fact[K + i - 1]).mod(MOD);
            x[i] = x[i].multiply(factInv[K - 1]).mod(MOD);
            x[i] = x[i].multiply(factInv[i - 1]).mod(MOD);
        }
        BigInteger coef = fact[N + M - 1].multiply(factInv[M]).mod(MOD);
        coef = coef.multiply(factInv[N - 1]).mod(MOD);
        coef = coef.multiply(power3[K + M]).mod(MOD);
        BigInteger answer = BigInteger.ZERO;
        for (