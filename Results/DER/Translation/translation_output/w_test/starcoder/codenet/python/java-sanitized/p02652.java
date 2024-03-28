import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = new int[3];
        d[0] = -1;
        d[1] = 1;
        d[2] = -1;
        int n0 = 0, n1 = 0, n2 = 0;
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            if (c == '1') n1++;
            if (c == '?') n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            int mid = (lo + hi) / 2;
            if (judge(lo, mid)) {
                hi = mid;
            } else {
                lo = mid;
            }
            if (hi - lo < 2) break;
        }
        return hi - lo;
    }

    public static boolean judge(int lo, int hi) {
        int n0 = 0, n1 = 0, n2 = 0;
        int[] d = new int[3];
        d[0] = -1;
        d[1] = 1;
        d[2] = -1;
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            if (c == '1') n1++;
            if (c == '?') n2++;
        }
        int target_lo = lo;
        int target_hi = hi;
        int pl = target_lo % 2 == 0;
        int ph = target_hi % 2 == 0;
        for (char c : S.toCharArray()) {
            int a = d[c - '0'][0];
            int b = d[c - '0'][1];
            target_lo = Math.max(target_lo + a, lo + pl);
            target_hi = Math.min(target_hi + b, hi - ph);
            if (target_hi < target_lo) return false;
            pl =!pl;
            ph =!ph;
        }
        return true;
    }
}