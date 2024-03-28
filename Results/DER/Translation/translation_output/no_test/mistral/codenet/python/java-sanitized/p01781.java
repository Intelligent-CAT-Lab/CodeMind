import java.util.Scanner;

public class p01781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int Z = Integer.parseInt(input[2]);
        int A = Integer.parseInt(input[3]);
        int B = Integer.parseInt(input[4]);
        int C = Integer.parseInt(input[5]);
        int N = Integer.parseInt(input[6]);

        int[] S = new int[N + X + Y + Z + 1];
        for (int i = 0; i < N; i++) {
            S[i] = (i * (i + 1)) / 2;
        }
        for (int i = N; i <= X + Y + Z; i++) {
            S[i] = (i * (i + 1)) / 2 + S[i - N];
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int k = ((X + Y + Z - i - 1) / N * N + i);
            ans[i] = (
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
        System.out.println();
    }

    public static int calc(int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}