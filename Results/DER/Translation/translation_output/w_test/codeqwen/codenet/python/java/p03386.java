Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> X = new ArrayList<>();
        for (int p = A; p <= B; p++) {
            if (p <= B) {
                X.add(p);
            }
        }

        List<Integer> Y = new ArrayList<>();
        for (int q = B - K + 1; q <= B; q++) {
            if (q >= A) {
                Y.add(q);
            }
        }

        List<Integer> ans = new ArrayList<>(X);
        ans.addAll(Y);
        ans.sort(null);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers A, B, and K from the standard input, creates two lists X and Y, and then prints the sorted list of unique integers from X and Y.
