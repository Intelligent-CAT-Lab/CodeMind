import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int n_k = n / k;
        int n_mod_k = n % k;

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (-i + k) % k;
            int c_mod = (-i + k) % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(a_mod, n_k, n_mod_k, k)
                     * mod_k(b_mod, n_k, n_mod_k, k)
                     * mod_k(c_mod, n_k, n_mod_k, k);
            }
        }

        System.out.println(ans);
    }

    private static int mod_k(int x, int n_k, int n_mod_k, int k) {
        int res = n_k;
        if (x != 0 && x <= n_mod_k) {
            res += 1;
        } else if (x == 0 && n_mod_k == k) {
            res += 1;
        }
        return res;
    }
}