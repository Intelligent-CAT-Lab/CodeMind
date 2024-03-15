import java.util.*;
import java.io.*;

public class p02206 {
    static int n, k;
    static boolean ok(long m) {
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
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        long l = 0, r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (ok(m)) l = m;
            else r = m;
        }
        System.out.println(l);
    }
}