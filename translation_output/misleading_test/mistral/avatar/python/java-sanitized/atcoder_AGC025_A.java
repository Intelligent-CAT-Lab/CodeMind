import java.util.*;

public class atcoder_AGC025_A {
    static int INF = Integer.MAX_VALUE;
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }
        System.out.println(ans);
    }

    static int dsum(int x) {
        return x;
    }
}