Here is the equivalent Java code for the given Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        scanner.close();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if (Math.pow(2, i) <= l) {
                d = i;
            } else {
                break;
            }
        }

        int n = d + 1;
        int m = 2 * d;
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
        }

        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, (int) (l - Math.pow(2, i - 1))});
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}
```

This Java code takes an integer input like the original Python code and calculates the required values, printing them in the expected format. The logic has been translated preserving the original structure; note that in Java, arrays start with index `0`, hence array indexes and operations are adjusted accordingly. The use of `Math.pow()` replaces the `**` exponentiation operator used in Python, and `ArrayList<int[]>` is used to dynamically store the tuples, which are now represented as arrays of integers (`int[]`). Additionally, I've wrapped the logic in a `Main` class with a `main` method, as this is the required structure for a Java program to run.
