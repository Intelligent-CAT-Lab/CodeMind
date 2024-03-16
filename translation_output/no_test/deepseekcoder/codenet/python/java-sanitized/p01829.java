import java.util.*;
import java.lang.*;

public class p01829 {
    static int inf = 1000000000;
    static int mod = 998244353;
    static int[] dd = {0,-1,0,1,0};
    static int[] ddn = {0,-1,-1,0,1,1,0,-1,-1};

    static String s;
    static int l;
    static int n;
    static int m = inf;
    static String r = "";
    static int t;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        s = in.next();
        l = s.length();
        n = Integer.parseInt(s);
        t = (int)Math.pow(10, l);
        permutation(new int[l], new boolean[10], 0);
        System.out.println(r);
    }

    static void permutation(int[] a, boolean[] used, int idx) {
        if (idx == l) {
            int b = 0;
            for (int i = 0; i < l; i++) {
                b = b * 10 + a[i];
            }
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = Arrays.toString(a).replaceAll("[\\[\\], ]", "");
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!used[i]) {
                a[idx] = i;
                used[i] = true;
                permutation(a, used, idx + 1);
                used[i] = false;
            }
        }
    }
}