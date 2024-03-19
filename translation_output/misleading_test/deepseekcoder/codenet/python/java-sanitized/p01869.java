import java.util.*;

public class p01869 {
    static ArrayList<Long> a = new ArrayList<>();

    public static void f(ArrayList<Long> a, long bin, long n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    public static long g(long n, int p) {
        long m = -1L << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) m = 1;
        if (a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if (n % 2 != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        f(a, 0, n);
        Collections.sort(a);
        long b = g(n, 0);
        if (b < 0) b = -1;
        System.out.println(b);
    }
}