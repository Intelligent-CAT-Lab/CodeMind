Here is the equivalent Java code which mimics the behavior of the given Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if ((1 << i) <= l) d = i;
        }
        int n = d + 1;
        int m = 2 * d;
        List<int[]> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, 1 << (i - 1)});
        }

        while (l > (1 << d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (1 << (i - 1)) > (1 << d) - 1) {
                    ans.add(new int[]{i, n, l - (1 << (i - 1))});
                    m++;
                    l -= (1 << (i - 1));
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + (i < a.length - 1 ? " " : "\n"));
            }
        }

        scanner.close();
    }
}
```
This Java program achieves the same functionality as the Python code. It calculates the maximum power of two less than or equal to `l`, constructs a list of tuples as edge definitions in a graph (represented as arrays), and finally prints the number of nodes `n`, the number of edges `m`, and the edges themselves. Note that in Java, you need to use `scanner.nextInt()` to read an integer input and `(1 << i)` to calculate the power of two. Also, Java uses zero-based array indexing, and we need to explicitly print spaces and newlines where required in printing the array's contents.
