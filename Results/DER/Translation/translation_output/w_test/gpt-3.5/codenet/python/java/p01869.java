```java
import java.util.*;

public class Main {

    static List<Long> a = new ArrayList<>();

    public static void f(List<Long> a, long bin, long n) {
        if (bin > n) return;
        if (bin > 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    public static int g(long n, int p) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0) m = 1;
        if (Math.pow(a.get(p), 2) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p) + 1;
        return Math.max(m, g(n, p + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if ((n & 1) == 1) {
            System.out.println(-1);
            System.exit(0);
        }
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }
}
```
