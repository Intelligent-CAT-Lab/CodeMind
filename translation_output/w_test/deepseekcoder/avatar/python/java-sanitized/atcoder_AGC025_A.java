import java.util.*;

public class atcoder_AGC025_A {
    static int INF = Integer.MAX_VALUE;
    static int mod = (int)Math.pow(10, 9) + 7;

    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, digitSum(a) + digitSum(b));
        }
        System.out.println(ans);
    }
}