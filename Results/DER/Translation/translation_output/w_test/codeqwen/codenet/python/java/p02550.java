Here is the Java version of your Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        arr[0] = x;
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            int val = (int) Math.pow(arr[i - 1], 2) % m;
            if (!s.contains(val)) {
                arr[i] = val;
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = 0;
        for (int i : arr) {
            res += i;
        }
        if (h != -1) {
            int[] new_arr = new int[arr.length - arr.length / (h + 1)];
            System.arraycopy(arr, arr.length / (h + 1), new_arr, 0, new_arr.length);
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i : new_arr) {
                ssum += i;
            }
            int rr = rest % c;
            for (int i = 0; i < rr; i++) {
                ssum += new_arr[i];
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers
