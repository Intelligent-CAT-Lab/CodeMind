import java.util.*;

public class p01869 {
    static ArrayList<Integer> a = new ArrayList<>();

    static void f(ArrayList<Integer> a, int bin, int n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    static int g(int n, int p) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x != a.size() && a.get(x) == n) m = 1;
        if (a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) b = -1;
        System.out.println(b);
    }
}