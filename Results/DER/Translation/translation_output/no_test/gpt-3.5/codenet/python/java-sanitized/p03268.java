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

        int ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (k - i) % k;
            int c_mod = (k - i) % k;

            if ((b_mod + c_mod) % k == 0) {
                ans += modK(n_k, n_mod_k, a_mod) * modK(n_k, n_mod_k, b_mod) * modK(n_k, n_mod_k, c_mod);
            }
        }

        System.out.println(ans);
    }

    public static int modK(int n_k, int n_mod_k, int x) {
        int res = n_k;
        if (x != 0 && x <= n_mod_k) {
            res++;
        } else if (x == 0 && n_mod_k == n_k) {
            res++;
        }
        return res;
    }
}