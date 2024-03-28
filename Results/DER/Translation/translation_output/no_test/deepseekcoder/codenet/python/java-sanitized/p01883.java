import java.util.*;

public class p01883 {
    static int inf = (int)1e20;
    static int mod = (int)1e9+7;
    static int[] dd = {-1, 0, 1, 0, 0, -1, -1, 1, 1};
    static int[] ddn = {-1, 0, 1, 0, -1, -1, 1, 1, -1, 0, 0, -1};

    static int I() {
        return new Scanner(System.in).nextInt();
    }

    static String S() {
        return new Scanner(System.in).next();
    }

    static void pf(String s) {
        System.out.println(s);
    }

    static String main() {
        int n = I();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(a.size()-1) + i);
        }

        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        ArrayList<Integer> r = new ArrayList<>(Collections.nCopies(t, 1));
        r.addAll(Collections.nCopies(t, 0));
        for (int i = 0; i < t; i++) {
            int ai = a.get(t-i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai-n);
                int temp = r.get(ti);
                r.set(ti, r.get(ti-ts));
                r.set(ti-ts, temp);
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2*t; i++) {
            sb.append((r.get(i) == 1) ? '(' : ')');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        pf(main());
    }
}