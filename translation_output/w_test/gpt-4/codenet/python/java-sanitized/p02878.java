import java.util.Scanner;

public class p02878 {
    public static void main(String[] args) {
        final int M = 998244353;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        F[0] = 1;
        
        // Calculate factorials and their modular inverses
        for (int n = 1; n < P; n++) {
            f = f * n % M;
            F[n] = f;
        }

        // Modular inverse using Fermat's Little