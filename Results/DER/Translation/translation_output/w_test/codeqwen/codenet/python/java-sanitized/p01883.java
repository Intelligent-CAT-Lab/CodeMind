import java.util.*;

public class p01883 {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -(t + 1);
        }
        char[] r = new char[t * 2];
        Arrays.fill(r, '(');
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = ')';
                r[ti - ts] = '(';
                n -= t - ts;
            } else {
                break;
            }
        }

        return new String(r);
    }
}