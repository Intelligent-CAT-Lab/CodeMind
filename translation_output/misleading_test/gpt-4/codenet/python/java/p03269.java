Here is the translated Java code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if ((1 << i) <= l) {
                d = i;
            }
        }

        int n = d + 1;
        int m = 2 * d;
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, 1 << (i - 1)});
        }

        while (l > (1 << d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (1 << (i - 1)) > (1 << d) - 1) {
                    ans.add(new int[]{i, n, l - (1 << (i - 1))});
                    m++;
                    l -= 1 << (i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }

        scanner.close();
    }
}
```
This Java program assumes that the input will be provided as a single integer (without an instruction prompt) and uses a `Scanner` to read the input from `System.in`. The logic from the Python code has been directly translated into Java, making use of `ArrayList` for dynamic arrays and bitwise operators for computing powers of two.
