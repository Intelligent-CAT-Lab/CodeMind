import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long[] S;

    public static void main(String[]$) throws IOException {
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        S = new long[X + Y + Z + 1];
        for (int k = 0; k < N; k++) {
            S[k] = (long)k * (k + 1) / 2;
        }
        for (int k = N; k <= X + Y + Z; k++) {
            S[k] = (long)k * (k + 1) / 2 + S[k - N];
        }

        long[] ans = new long[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = calc(k + 1, X - A, Y - B, Z - C)
                    + calc(k, A, Y - B, Z - C)
                    + calc(k, X - A, B, Z - C)
                    + calc(k, X - A, Y - B, C)
                    + calc(k - 1, A, B, Z - C)
                    + calc(k - 1, X - A, B, C)
                    + calc(k - 1, A, Y - B, C)
                    + calc(k - 2, A, B, C);
        }
        PrintStream out = new PrintStream(System.out);
        for (int i = 0; i < N; i++) {
            out.print(ans[i]);
            out.print(' ');
        }
        out.println();
        out.flush();
    }

    static long calc(int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}