import java.util.Arrays;
import java.util.List;

public class p01869 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }

        List<Integer> a = new ArrayList<>();
        f(a, 0, n);
        a = Arrays.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    public static void f(List<Integer> a, int bin, int n) {
        if (bin > n) {
            return;
        }
        if (bin) {
            a.add(bin);
        }
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    public static int g(int n, int p) {
        int m = -1 << 20;
        int x = Arrays.binarySearch(a, n);
        if (x != a.length && a[x] == n) {
            m = 1;
        }
        if (a[p] * a[p] > n) {
            return m;
        }
        if (n % a[p] == 0) {
            m = g(n / a[p], p) + 1;
        }
        return Math.max(m, g(n, p + 1));
    }
}