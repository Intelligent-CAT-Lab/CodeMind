import java.util.ArrayList;
import java.util.Collections;

public class p01869 {
    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        if (n % 2 != 0) {
            System.out.println(-1);
            return;
        }
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    static void f(ArrayList<Integer> a, int bin, int n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    static int g(int n, int p) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) m = 1;
        if (a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }
}