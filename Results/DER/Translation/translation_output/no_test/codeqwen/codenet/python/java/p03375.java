```java
import java.util.*;
import java.lang.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        BigInteger[][] B = new BigInteger[N+1][N+1];
        B[0][0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            // 1çªãåç¬ã§ä½¿ã
            for (int l = 1; l <= N; l++) {
                B[n][l] = B[n-1][l-1];
            }
            // 1çªãã©ããã«æ··ãã¦ããã
            for (int l = 1; l <= N; l++) {
                B[n][l] = B[n-1][l].add(B[n-1][l].multiply(BigInteger.valueOf(l)).mod(BigInteger.valueOf(MOD)));
                B[n][l] = B[n][l].mod(BigInteger.valueOf(MOD));
            }
        }

        // 2^{kl}
        BigInteger[][] pow_2 = new BigInteger[N+1][N+1];
        pow_2[0][0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow_2[n][0] = pow_2[n-1][0].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
            for (int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n-1][l].multiply(pow_2[1][0]).mod(BigInteger.valueOf(MOD));
            }
        }

        BigInteger[] pow
