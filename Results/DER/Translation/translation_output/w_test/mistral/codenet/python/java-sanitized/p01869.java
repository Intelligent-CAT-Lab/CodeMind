import java.util.*;

public class p01869 {
    static int[] a;
    static int n;
    static int[] b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n & 1 == 1) {
            System.out.println(-1);
            return;
        }
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);
        int ans = g(n, 0);
        if (ans < 0) {
            ans = -1;
        }
        System.out.println(ans);
    }

    public static int g(int n, int p) {
        int m = (1 << 20) - 1;
        int x = bisect.bisect_left(a, n);
        if (x != a.length && a[x] == n) {
            m = 1;
        }
        if (a[p] * a[p] > n) {
            return m;
        }
        if (n % a[p] == 0) {
            return g(n / a[p], p) + 1;
        }
        return Math.max(g(n, p + 1), g(n, p));
    }
}