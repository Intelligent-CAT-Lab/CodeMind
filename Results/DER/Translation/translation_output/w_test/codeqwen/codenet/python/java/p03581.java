Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        long MOD = (long) Math.pow(10, 9) + 7;

        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k < n; k++) {
                comb[n][k] = (comb[n - 1][k] + comb[n - 1][k + 1]) % MOD;
            }
        }

        long[][] combCum = new long[U][U];
        for (int n = 0; n < U; n++) {
            for (int k = 0; k < n; k++) {
                combCum[n][k] = (combCum[n - 1][k] + comb[n][k]) % MOD;
            }
        }

        // (1,s) ããä½¿ããªãå ´å. (éãèµ¤) -> æ°ãä¸ã
        long[][] S = new long[U][U];
        S[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k < n; k++) {
                S[n][k] = (combCum[n - 1][k] + S[n - 1][k]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B - 1][k] * (S[k][A - k] %
