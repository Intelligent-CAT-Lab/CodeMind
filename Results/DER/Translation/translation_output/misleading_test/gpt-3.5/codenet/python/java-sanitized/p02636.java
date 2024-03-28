import java.util.*;

public class p02636 {

    static long mod = 998244353;
    static int N = 2* (int) Math.pow(10, 3);
    static long[] g1 = new long[N+1];
    static long[] g2 = new long[N+1];
    static long[] inverse = new long[N+1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        in.close();
        int N = S.length();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i <= N; i++) {
            g1[i] = 1;
            g2[i] = 1;
            inverse[i] = 1;
        }
        inverse[0] = 0;

        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i-1] * i) % mod;
            inverse[i] = (-inverse[(int)mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i-1] * inverse[i]) % mod;
        }

        long[][][] dp = new long[N+1][N+2][N+2];
        long[][][] dpf = new long[N+1][N+2][N+2];
        dpf[0][0][0] = 1;

        if (S.charAt(0) == '0') dp[1][1][0] = 0;
        if (S.charAt(1) == '0') dp[1][1][0] = 0;
        if (S.charAt(0) == '1') dp[1][0][1] = 0;
        if (S.charAt(1) == '1') dp[1][0][1] = 0;
        dpf[1][0][0] = 2;

        int Zero = 1 - Character.getNumericValue(S.charAt(0)) + 1 - Character.getNumericValue(S.charAt(1));
        int One = Character.getNumericValue(S.charAt(0)) + Character.getNumericValue(S.charAt(1));

        for (int i = 2; i < N; i++) {
            Zero += 1 - Character.getNumericValue(S.charAt(i));
            One += Character.getNumericValue(S.charAt(i));

            for (int j = 0; j <= Zero; j++) {
                for (int k = 0; k <= One; k++) {
                    int a = 1 - Character.getNumericValue(S.charAt(i));
                    int b = Character.getNumericValue(S.charAt(i));
                    dp[i][j][k] = Math.max(dp[i-1][j-a][k-b] - 2, dpf[i-1][j-a][k-b] - 1);
                    a = 1 - Character.getNumericValue(S.charAt(i-1));
                    b = Character.getNumericValue(S.charAt(i-1));
                    dpf[i][j][k] = Math.max(dpf[i-1][j][k] + 1, dp[i-1][j][k] + 1 - dp[i-1][j][k] % 2);
                    dp[i][j][k] = Math.max(dp[i][j][k], 2 * (dpf[i-2][j-a][k-b] / 2), 2 * (dp[i-2][j-a][k-b] / 2));
                    if (dp[i][j][k] < 0) dp[i][j][k] = -1 * (int) Math.pow(10, 5);
                    if (dpf[i][j][k] < 0) dpf[i][j][k] = -1 * (int) Math.pow(10, 5);
                }
            }
            dpf[i][0][0] = i + 1;
        }

        char[] arr = S.toCharArray();
        int zero = arr.length - 1 - Zero;
        int one = One;
        long ans = 1;
        HashSet<String> check = new HashSet<>();

        for (int i = 0; i < N; i++) {
            Zero += (arr[i] == '1') ? 1 : 0;
            One += (arr[i] == '0') ? 1 : 0;

            HashSet<String> ncheck = new HashSet<>();
            for (String str : check) {
                String[] split = str.split(",");
                int j = Integer.parseInt(split[0]);
                int k = Integer.parseInt(split[1]);
                long A = (j != 0) ? cmb(Zero + j - 1, j, mod) : 1;
                long B = (k != 0) ? cmb(One + k - 1, k, mod) : 1;
                ans += A * B % mod;
            }

            check.clear();
            for (int j = 0; j <= zero; j++) {
                for (int k = 0; k <= one; k++) {
                    if ((dp[N-1-i][j][k] >= 0 || dpf[N-1-i][j][k] >= 0) && (j != 0 || k != 0)) {
                        check.add(j + "," + k);
                    }
                }
            }

            for (String str : check) {
                String[] split = str.split(",");
                int j = Integer.parseInt(split[0]);
                int k = Integer.parseInt(split[1]);
                long A = (j != 0) ? cmb(Zero + j - 1, j, mod) : 1;
                long B = (k != 0) ? cmb(One + k - 1, k, mod) : 1;
                ans += A * B % mod;
                int a = 1 - Character.getNumericValue(arr[i]);
                int b = Character.getNumericValue(arr[i]);
                if (j >= a && k >= b) {
                    ncheck.add((j - a) + "," + (k - b));
                }
            }

            check = ncheck;
            zero -= 1 - Character.getNumericValue(arr[i]);
            one -= Character.getNumericValue(arr[i]);
        }

        System.out.println(ans);
    }

    static long cmb(int n, int r, long mod) {
        if (r < 0 || r > n) return 0;

        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n-r] % mod;
    }
}