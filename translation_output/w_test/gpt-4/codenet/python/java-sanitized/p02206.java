import java.io.*;
import java.util.*;

public class p02206 {
    private static int n;
    private static long k;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        long l = 0;
        long r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) >> 1;
            if (isOk(m)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
    
    private static boolean isOk(long m) {
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
}