import java.io.*;
import java.util.*;

public class p02206 {
    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(stdin.readLine());
        }
        return st.nextToken();
    }

    static boolean ok(long m, long k, int n) {
        long s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) return false;
            if (cnt == n) break;
            m >>= 1;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int n = readInt();
        long k = readInt();
        long l = 0;
        long r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (ok(m, k, n)) l = m;
            else r = m;
        }
        System.out.println(l);
    }
}