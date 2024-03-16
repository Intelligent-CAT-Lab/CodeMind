import java.util.*;
import java.io.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = 0, r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (ok(m)) l = m;
            else r = m;
        }
        System.out.println(l);
    }

    public static boolean ok(int m) {
        int s = 0, cnt = 0;
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