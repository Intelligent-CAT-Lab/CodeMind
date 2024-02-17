import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = new int[h][w];
        for (int i = 0; i < h; i++) {
            if (i >= b) {
                Arrays.fill(array[i], 0, a, 1);
            } else {
                Arrays.fill(array[i], a, w, 1);
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}