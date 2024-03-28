import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int n_k = n / k;
        int n_mod_k = n % k;

        int[] mod_k = new int[k];
        for (int i = 0; i < k; i++) {
            mod_k[i] = n_k;
            if (i != 0 && i <= n_mod_k) {
                mod_k[i]++;
            } else if (i == 0 && n_mod_k == k) {
                mod_k[i]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = (k - i) % k;
            int c_mod = (k - i) % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k[a_mod] * mod_k[b_mod] * mod_k[c_mod];
            }
        }

        System.out.println(ans);
    }
}