import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        Map<Character, int[]> d = new HashMap<>();
        d.put('0', new int[]{-1});
        d.put('1', new int[]{1});
        d.put('?', new int[]{-1, 1});
        int[] Sarr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            Sarr[i] = d.get(S.charAt(i))[0];
        }
        int n0 = 0, n1 = 0, n2 = 0;
        for (int s : Sarr) {
            if (s == -1) n0++;
            else if (s == 1) n1++;
            else n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        int best = 1000000 * 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (judge(mid, Sarr)) {
                best = Math.min(best, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return best;
    }

    public static boolean judge(int target, int[] Sarr) {
        int n0 = 0, n1 = 0, n2 = 0;
        for (int s : Sarr) {
            if (s == -1) n0++;
            else if (s == 1) n1++;
            else n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        if (target < lo || target > hi) return false;
        int pl = n0 % 2 == 0? 0 : 1;
        int ph = n1 % 2 == 0? 0 : 1;
        for (int s : Sarr) {
            int[] a = {-1, 1};
            int[] b = {-1, 1};
            int lo1 = lo + a[s] * pl;
            int hi1 = hi + b[s] * ph;
            if (hi1 < lo1) return false;
            pl = (pl + 1) % 2;
            ph = (ph + 1) % 2;
        }
        return true;
    }
}