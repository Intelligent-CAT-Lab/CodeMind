Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        List<Integer> X = new ArrayList<>();
        for (int p = A; p <= A + K; p++) {
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
        ans = ans.stream().distinct().sorted().collect(Collectors.toList());

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers A, B, and K from the standard input, creates two lists X and Y, and then combines them into a single list ans. It removes duplicates from ans, sorts it, and then prints out each element of ans.
