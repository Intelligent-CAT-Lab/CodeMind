import java.util.*;

public class atcoder_AGC025_A {
    static int N;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
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