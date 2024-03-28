import java.util.*;
import java.io.*;

public class p02206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (ok(m, n, k)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    static boolean ok(int m, int n, int k) {
        int s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) {
                return false;
            }
            if (cnt == n) {
                break;
            }
            m >>= 1;
        }
        return true;
    }
}