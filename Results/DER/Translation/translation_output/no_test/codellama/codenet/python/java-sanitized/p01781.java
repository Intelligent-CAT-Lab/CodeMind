import java.util.Scanner;

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

        int[] S = new int[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = (
                    calc(k + 1, X - A, Y - B, Z - C)
                    + calc(k, A, Y - B, Z - C)
                    + calc(k, X - A, B, Z - C)
                    + calc(k, X - A, Y - B, C)
                    + calc(k - 1, A, B, Z - C)
                    + calc(k - 1, X - A, B, C)
                    + calc(k - 1, A, Y - B, C)
                    + calc(k - 2, A, B, C)
            );
        }
        System.out.println(String.join(" ", ans));
    }

    private static int calc(int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}</s>