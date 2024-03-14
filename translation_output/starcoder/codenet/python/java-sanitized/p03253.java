import java.util.*;
import java.io.*;

public class p03253 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] fact = new int[200001];
        int[] inv = new int[200001];
        int[] invfact = new int[200001];
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < 200001; i++) {
            fact[i] = fact[i - 1] * i % 1000000007;
            inv[i] = inv[1000000007 % i] * (1000000007 - 1000000007 / i) % 1000000007;
            invfact[i] = invfact[i - 1] * inv[i] % 1000000007;
        }
        int ans = 1;
        for (int e : primeFactor(m).values()) {
            ans = (ans * nCk(e + n - 1, e)) % 1000000007;
        }
        System.out.println(ans);
    }

    public static Map<Integer, Integer> primeFactor(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n!= 1) {
            ret.put(n, ret.getOrDefault(n, 0) + 1);
        }
        return ret;
    }

    public static int nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return ((fact[n] * invfact[k]) % 1000000007 * invfact[n - k]) % 1000000007;
    }
}