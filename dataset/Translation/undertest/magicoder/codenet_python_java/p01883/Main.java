import java.util.*;

public class p01883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(i - 1) + i);
        }
        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            r.add(1);
        }
        for (int i = 0; i < t; i++) {
            r.add(0);
        }
        int ai = a.get(t);
        int ti = t;
        if (n < ai) {
            int ts = Math.min(t, ai - n);
            Collections.swap(r, ti, ti - ts);
            n -= t - ts;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r.size(); i++) {
            sb.append(r.get(i) == 1 ? '(' : ')');
        }
        System.out.println(sb.toString());
    }
}