import java.util.*;

public class p01883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        Arrays.fill(a, 0);
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
        int t = bisect.bisect_left(a, n);
        int[] r = new int[t + 1];
        Arrays.fill(r, 1);
        for (int i = t; i >= 0; i--) {
            int ai = a[i];
            int ti = i + 1;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = r[ti];
                n -= t - ts;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= t; i++) {
            sb.append(r[i] == 1 ? "(" : ")");
        }
        System.out.println(sb.toString());
    }
}