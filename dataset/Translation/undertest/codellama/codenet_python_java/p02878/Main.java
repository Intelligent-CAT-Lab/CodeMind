import java.util.Scanner;

public class p02878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        int f = 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;
        for (int n = 1; n < P; n++) {
            F[n] = f = f * n % M;
        }
        I[N] = pow(f, M - 2, M);
        for (int n = N; n > 1; n--) {
            I[n - 1] = I[n] * n % M;
        }
        for (int k = min(A + 1, N - B) if N - B - A else A + 1; k < P; k++) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M if B else 1);
    }
}