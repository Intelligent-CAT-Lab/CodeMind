import java.io.*;
import java.util.*;

public class p02335 {
    
    static int MOD = (int)Math.pow(10, 9) + 7;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(C(k, n) % MOD);
    }

    static int P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static int C(int n, int r) {
        return P(n, r) / factorial(r);
    }

    static int H(int n, int r) {
        return C(n + r - 1, r);
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            if (result >= MOD) {
                result %= MOD;
            }
        }
        return result;
    }
}