import java.util.*;

public class p01869 {
    static int[] a;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n & 1 == 1) {
            System.out.println(-1);
            return;
        }
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    public static int g(int n, int p) {
        int m = Integer.MIN_VALUE << 20;
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
        return Math.max(m, g(n, p + 1));
    }

    public static void f(int[] a, int bin, int n) {
        if (bin > n) {
            return;
        }
        if (bin != 0) {
            a[bin] = bin;
        }
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }
}