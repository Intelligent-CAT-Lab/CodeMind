import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p01869 {
    private static final ArrayList<Long> a = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        if ((n & 1) != 0) {
            System.out.println(-1);
            return;
        }

        f(0, n);
        Collections.sort(a);

        int b = g(n, 0);
        if (b < 0) b = -1;
        System.out.println(b);
    }

    private static void f(long bin, long n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(bin * 10 + 2, n);
        f(bin * 10 + 8, n);
    }

    private static int g(long n, int p) {
        final int mInf = -1 << 20;
        int m = mInf;
        int x = Collections.binarySearch(a, n);

        if (x >= 0 && a.get(x) == n) m = 1;
        if (p >= a.size() || a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = Math.max(m, g(n / a.get(p), p) + 1);
        return Math.max(m, g(n, p + 1));
    }
}