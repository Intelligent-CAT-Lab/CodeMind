import java.util.*;
public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int a = i, b = n - i;
            ans = Math.min(ans, a + b);
        }
        System.out.println(ans);
    }
}