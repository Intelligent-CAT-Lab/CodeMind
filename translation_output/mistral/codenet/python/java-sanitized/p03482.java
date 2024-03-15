import java.io.*;
import java.util.*;

public class p03482 {
    static Scanner sc = new Scanner(System.in);
    static int mod = 1000000007;
    static long INF = 1000000000000000000L;
    static double eps = 1e-7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int N = S.length();
        long ans = N;
        long ans2 = N;
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