import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p03830 {
    static final int MOD = 1000000007;
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = II();
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] kv : factorization(i)) {
                d.put(kv[0], d.getOrDefault(kv[0], 0) + kv[1]);
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= MOD;
        }
        System.out.println(r);
    }

    public static int II() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    // Helper function to perform factorization.
    public static int[][] factorization(int n) {
        HashMap<Integer, Integer> factors = new HashMap<>();

        int count = 0;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        if (count > 0) factors.put(2, count);

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) factors.put(i, count);
        }

        if (n > 1) factors.put(n, 1);

        return factors.entrySet().stream().map(e -> new int[]{e.getKey(), e.getValue()}).toArray(int[][]::new);
    }
}