import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p01869 {

    // Setting the list of "a" as a static field
    static List<Integer> a = new ArrayList<>();

    // f function to fill the "a" list
    public static void f(int bin, int n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(bin * 10 + 2, n);
        f(bin * 10 + 8, n);
    }

    // g function to calculate the result
    public static int g(int n, int p) {
        int m = Integer.MIN_VALUE / 2; // -1 << 20 is roughly Integer.MIN_VALUE / 2
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) m = 1;
        if ((long) a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = Math.max(m, g(n / a.get(p), p) + 1);
        return Math.max(m, g(n, p + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Check if n is odd
        if ((n & 1) == 1) {
            System.out.println(-1);
            return;
        }

        f(0, n);
        Collections.sort(a); // Sort the list "a"
        int b = g(n, 0);
        if (b < 0) b = -1;

        System.out.println(b);
    }
}