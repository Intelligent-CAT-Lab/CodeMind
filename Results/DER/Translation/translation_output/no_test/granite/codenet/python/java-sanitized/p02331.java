import java.util.*;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 100000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * k) % mod;
        }
        System.out.println(ans);
    }
}