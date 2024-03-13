import java.util.Scanner;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int firstD = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int lo = -1;
        long[][] state = {{0, a % m, 1}};

        for (int d = firstD; d < 19; d++) {
            int hi = Math.min((int) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;
            long[][] coe = {
                    {(long) Math.pow(10, d) % m, 0, 0},
                    {1, 1, 0},
                    {0, b % m, 1}
            };

            coe = exp(coe, cnt, m);
            state = multiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    private static long[][] exp(long[][] a, int e, int m) {
        long[][] r = new long[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            r[i][i] = 1;
        }

        long[][] t = new long[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i], 0, t[i], 0, a[i].length);
        }

        while (e > 0) {
            if ((e & 1) == 1) {
                r = multiply(r, t, m);
            }
            t = multiply(t, t, m);
            e >>= 1;
        }

        return r;
    }

    private static long[][] multiply(long[][] a, long[][] b, int m) {
        long[][] result = new long[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return result;
    }
}