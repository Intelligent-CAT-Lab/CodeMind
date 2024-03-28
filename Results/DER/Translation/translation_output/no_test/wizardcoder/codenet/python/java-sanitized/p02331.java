import java.util.*;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = 1000000007;
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * k) % MOD;
        }
        System.out.println(ans);
    }
}