Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        if (n % 2 != 0) {
            System.out.println(-1);
            return;
        }
        ArrayList<Integer> a = new ArrayList<>();
        f(a, 0, n);
        Collections.sort(a);
        int b = g(n, 0, a);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    public static void f(ArrayList<Integer> a, int bin, int n) {
        if (bin > n) return;
        if (bin != 0) a.add(bin);
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }

    public static int g(int n, int p, ArrayList<Integer> a) {
        int m = -1 << 20;
        int x = Collections.binarySearch(a, n);
        if (x >= 0 && a.get(x) == n) m = 1;
        if (a.get(p) * a.get(p) > n) return m;
        if (n % a.get(p) == 0) m = g(n / a.get(p), p, a) + 1;
        return Math.max(m, g(n, p + 1, a));
    }
}
```

Please note that Java does not have a built-in function to calculate the binary search, so I used the `Collections.binarySearch()` method. Also, Java does not have a built-in function to calculate the power of a number, so I used the `Math.pow()` method.
