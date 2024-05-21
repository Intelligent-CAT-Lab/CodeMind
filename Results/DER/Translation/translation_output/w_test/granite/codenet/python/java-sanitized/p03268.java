import java.util.*;

public class p03268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int n_k = n / k;
        int n_mod_k = n % k;

        int ans = 0;
        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (-i) % k;
            int c_mod = (-i) % k;
            if ((b_mod + c_mod) % k == 0) {
                int count = 1;
                if (a_mod!= 0 && a_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (a_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                if (b_mod!= 0 && b_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (b_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                if (c_mod!= 0 && c_mod <= n_mod_k) {
                    count *= (n_k + 1);
                } else if (c_mod == 0 && n_mod_k == k) {
                    count *= (n_k + 1);
                }
                ans += count;
            }
        }
        System.out.println(ans);
    }
}