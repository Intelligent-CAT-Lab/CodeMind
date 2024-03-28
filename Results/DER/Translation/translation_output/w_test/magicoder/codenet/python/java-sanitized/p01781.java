import java.util.*;

public class p01781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        long[] S = new long[2 * (X + Y + Z + 1)];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        long[] ans = new long[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = calc(S, k + 1, X - A, Y - B, Z - C)
                    + calc(S, k, A, Y - B, Z - C)
                    + calc(S, k, X - A, B, Z - C)
                    + calc(S, k, X - A, Y - B, C)
                    + calc(S, k - 1, A, B, Z - C)
                    + calc(S, k - 1, X - A, B, C)
                    + calc(S, k - 1, A, Y - B, C)
                    + calc(S, k - 2, A, B, C);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    private static long calc(long[] S, int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}