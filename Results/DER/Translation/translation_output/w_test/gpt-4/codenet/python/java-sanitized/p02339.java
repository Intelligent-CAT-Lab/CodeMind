import java.util.*;
import java.io.*;

public class p02339 {
    static final int MOD = 1000000007;

    static int nextInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static long nextLong(BufferedReader br) throws IOException {
        return Long.parseLong(br.readLine().trim());
    }

    static double nextDouble(BufferedReader br) throws IOException {
        return Double.parseDouble(br.readLine().trim());
    }

    static int[] nextIntArray(BufferedReader br) throws IOException {
        String[] elements = br.readLine().trim().split(" ");
        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        return arr;
    }

    static long[] nextLongArray(BufferedReader br) throws IOException {
        String[] elements = br.readLine().trim().split(" ");
        long[] arr = new long[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Long.parseLong(elements[i]);
        }
        return arr;
    }

    static String nextString(BufferedReader br) throws IOException {
        return br.readLine().trim();
    }

    static String[] nextStringArray(BufferedReader br) throws IOException {
        return br.readLine().trim().split(" ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int[] values = nextIntArray(br);
        int n = values[0];
        int k = values[1];

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (dp[i][j] + (int)((long)(j + 1) * dp[i][j + 1] % MOD)) % MOD;
            }
        }
        
        out.println(dp[n][k]);
        out.flush();
    }
}