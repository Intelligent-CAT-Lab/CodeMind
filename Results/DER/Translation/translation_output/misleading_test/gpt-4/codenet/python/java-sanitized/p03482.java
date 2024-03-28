import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03482 {
    private static final int MOD = (int)1e9 + 7;
    private static final long INF = (long)1e18;
    private static final double EPS = 1e-7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String S = reader.readLine().trim();
        int N = S.length();
        int ans = N;
        int ans2 = N;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }

        System.out.println(Math.max(ans, ans2));
    }
}