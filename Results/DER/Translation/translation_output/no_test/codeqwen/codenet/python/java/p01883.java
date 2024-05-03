```java
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -(t + 1);
        }
        int[] r = new int[2 * t];
        Arrays.fill(r, 1);
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            // System.out.println(n + " " + ai + " " + ti + " " + Arrays.toString(r));
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = r[ti];
                n -= t - ts;
            } else {
                break;
            }
        }

        return Arrays.stream(r).mapToObj(i -> "()"[i]).collect(Collectors.joining());
    }

    static Scanner sc = new Scanner(System.in);
}
```
