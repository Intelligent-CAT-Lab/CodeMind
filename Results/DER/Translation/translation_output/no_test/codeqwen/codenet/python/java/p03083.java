Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int)1e9 + 7;

        int[] fact = new int[B + W + 1];
        int[] invf = new int[B + W + 1];
        fact[0] = 1;
        invf[0] = 1;
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            invf[i] = inved(fact[i], mod);
        }

        int[] bina = new int[B + W + 1];
        int[] invb = new int[B + W + 1];
        bina[0] = 1;
        invb[0] = 1;
        for (int i = 1; i <= B + W; i++) {
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = inved(bina[i], mod);
        }

        if (B == W) {
            for (int i = 0; i < B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = W; i <= B; i++) {
                int F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod
