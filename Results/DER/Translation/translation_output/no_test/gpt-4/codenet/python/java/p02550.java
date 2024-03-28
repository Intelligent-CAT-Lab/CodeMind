Here's the equivalent Java code for the given Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        arr[0] = x;
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1, r = 0;
        for (int i = 1; i < n; i++) {
            int val = (int) ((long) arr[i - 1] * arr[i - 1] % m);
            if (!s.contains(val)) {
                arr[i] = val;
                s.add(val);
            } else {
                h = i - 1;
                r = val;
                break;
            }
        }

        long res = 0;
        for (int i = 0; i <= h && i < n; i++) {
            res += arr[i];
        }
        if (h != -1) {
            int newIndex = -1;
            for (int i = 0; i <= h; i++) {
                if (arr[i] == r) {
                    newIndex = i;
                    break;
                }
            }
            int[] new_arr = new int[h - newIndex + 1];
            for (int i = newIndex; i <= h; i++) {
                new_arr[i - newIndex] = arr[i];
            }
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            long ssum = 0;
            for (int val : new_arr) {
                ssum += val;
            }
            ssum *= q;
            int remaining = rest % c;
            for (int i = 0; i < remaining; i++) {
                ssum += new_arr[i];
            }
            res += ssum;
        }

        System.out.println(res);
        sc.close();
    }
}
```

Keep in mind that the long type is used for the `res` and `ssum` variables to accommodate the possibly large sums that might exceed the integer limit. Integer arithmetic in Java can overflow silently, so explicit casting to long before multiplication ensures that we don't encounter unexpected overflows. In the original Python code, this wasn't an issue because Python integers can grow to arbitrarily large sizes.
