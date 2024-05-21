import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            int sum = 0;
            int tmp = a;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            tmp = b;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}