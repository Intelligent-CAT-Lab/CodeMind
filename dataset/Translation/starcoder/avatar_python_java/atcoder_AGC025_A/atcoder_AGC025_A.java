import java.util.*;
public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int b = n - i;
            ans = Math.min(ans, dsum(i) + dsum(b));
        }
        System.out.println(ans);
    }
    public static int dsum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}