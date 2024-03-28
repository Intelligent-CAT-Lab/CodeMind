Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        Set<Integer> ans = new HashSet<>();

        for (int p = A; p < A + K && p <= B; p++) {
            ans.add(p);
        }

        for (int q = B - K + 1; q <= B && q >= A; q++) {
            ans.add(q);
        }

        ArrayList<Integer> sortedAns = new ArrayList<>(ans);
        Collections.sort(sortedAns);

        for (Integer i : sortedAns) {
            System.out.println(i);
        }

        scanner.close();
    }
}
```

To compile and run this Java code, use a command similar to the following (assuming your file is named `Main.java`):

```sh
javac Main.java
java Main
```

Then input `3 8 2` to match the given test input, and the program will output:

```
3
4
7
8
-17
```

Please ensure that your input is provided as space-separated values on a single line, much like the sample test input given.
