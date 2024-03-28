import java.util.*;
public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}