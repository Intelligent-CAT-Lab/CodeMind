import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p01781 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int nextInt() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) {
        int X = nextInt(), Y = nextInt(), Z = nextInt(), A = nextInt(), B = nextInt(), C = nextInt(), N = nextInt();

        long[] S = new long[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++)
            S[k] = k * (k + 1) / 2;
        for (int k = N; k < X + Y + Z + 1; k++)
            S[k] = k * (k + 1) / 2 + S[k - N];

        long calc = (x, y, z) -> S[(int)x+y+z] - S[(int)x-1+y+z] - S[(int)x+y-1+z] - S[(int)x+y+z-1]
                + S[(int)x-1+y-1+z] + S[(int)x+y-1+z-1] + S[(int)x+y+z-1-1] - S[(int)x-1+y-1+z-1];

        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            sb.append(calc(calc, k+1, X-A, Y-B, Z-C)
                    + calc(calc, k, A, Y-B, Z-C)
                    + calc(calc, k, X-A, B, Z-C)
                    + calc(calc, k, X-A, Y-B, C)
                    + calc(calc, k-1, A, B, Z-C)
                    + calc(calc, k-1, X-A, B, C)
                    + calc(calc, k-1, A, Y-B, C)
                    + calc(calc, k-2, A, B, C));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static long calc(IntFunction<Long> calc, long k, long x, long y, long z) {
        return calc.apply(k) - calc.apply(k-x-1) - calc.apply(k-y-1) - calc.apply(k-z-1)
                + calc.apply(k-x-y-1) + calc.apply(k-y-z-1) + calc.apply(k-z-x-1) - calc.apply(k-x-y-z-1);
    }
}