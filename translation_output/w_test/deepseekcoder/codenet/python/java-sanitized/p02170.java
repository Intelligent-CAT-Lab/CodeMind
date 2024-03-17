import java.util.*;
import java.io.*;

public class p02170 {
    static int mod = (int) 1e9 + 7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = a * pow(100*n, mod-2, mod);
        long inv = pow(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod;
            } else {
                lst[i] = (A * (lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}