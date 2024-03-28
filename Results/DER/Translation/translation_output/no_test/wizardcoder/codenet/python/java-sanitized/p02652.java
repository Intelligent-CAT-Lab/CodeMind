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
        while (true) {
            int mid = (lo + hi) / 2;
            if (judge(Sarr, lo, mid)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
            if (hi - lo < best) {
                best = hi - lo;
            } else {
                break;
            }
        }
        int ans = best;
        lo = 1;
        hi = n1 + n2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (judge(Sarr, mid, hi)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        ans = Math.min(ans, hi - lo + 1);
        return ans;
    }

    public static boolean judge(int[] Sarr, int lo, int hi) {
        int n0 = 0, n1 = 0, n2 = 0;
        int pl = lo % 2 == 0;
        int ph = hi % 2 == 0;
        for (int s : Sarr) {
            int a = s > 0? 1 : -1;
            int b = s < 0? 1 : -1;
            lo = Math.max(lo + a, -n0 - n2 + pl);
            hi = Math.min(hi + b, n1 + n2 - ph);
            if (hi < lo) {
                return false;
            }
            pl =!pl;
            ph =!ph;
            if (s == -1) n0++;
            else if (s == 1) n1++;
            else n2++;
        }
        return true;
    }
}