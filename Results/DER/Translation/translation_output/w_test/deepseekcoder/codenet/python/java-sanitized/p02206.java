import java.util.*;
import java.lang.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(solve(n, k));
    }

    private static int solve(int n, int k) {
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
        return l;
    }

    private static boolean ok(int m, int n, int k) {
        int s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt += 1;
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