import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p01869 {
    static ArrayList<Integer> a = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n & 1) == 1) {
            System.out.println(-1);
            System.exit(0);
        }
        f(0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    static void f(int bin, int n) {
        if (bin > n) return;
        if (bin > 0) a.add(bin);
        f(bin * 10 + 2, n);
        f(bin * 10 + 8, n);
    }

    static int g(int n, int p) {
        int m = Integer.MIN_VALUE;
        int x = Collections.binarySearch(a, n);
        if (x >= 0) m = 1;
        if (p < a.size() && (long) a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }
}