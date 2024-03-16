import java.util.*;
import java.io.*;

public class p03581 {
    static int readInt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return Integer.parseInt(s);
    }

    static int readIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
        }
        return arr;
    }

    static long mod(long x, long y) {
        long m = x % y;
        if (m < 0) {
            if (y < 0) {
                return m - y;
            } else {
                return m + y;
            }
        }
        return m;
    }

    static long comb(int n, int k) {
        long[][] comb = new long[2001][2001];
        comb[0][0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1];
            }
            comb[i][i] %= 1000000007;
        }
        return comb[n - 1][k];
    }

    static long combCum(int n) {
        long[] combCum = new long[2001];
        for (int i = 0; i < n; i++) {
            combCum[i] = comb(i, i);
        }
        return combCum;
    }

    static long solve(int A, int B) throws IOException {
        long[] comb = readIntArray(2001);
        long[] combCum = combCum(2001);
        long S = new long[2001][2001];
        for (int i = 0; i < 2001; i++) {
            Arrays.fill(S[i], 0);
            S[i][0] = 1;
            for (int j = 1; j < 2001; j++) {
                S[i][j] = mod(S[i][j - 1] + S[i - 1][j - 1], 1000000007);
            }
        }
        long x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B - 1][k] * mod(S[k][0], 1000000007);
        }
        return mod(x, 1000000007);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = readIntArray(n);
        long ans = solve(arr[0], arr[1]);
        System.out.println(ans);
    }
}