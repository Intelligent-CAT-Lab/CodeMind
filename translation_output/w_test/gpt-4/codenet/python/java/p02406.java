Here is the Java translation of the provided Python code:

```java
import java.util.*;

public class DivisibleOrContainsThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A.add(i);
            }
        }

        System.out.print(" ");
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}
```

When you provide an input of 30, this Java program will produce the following output:

```
 3 6 9 12 13 15 18 21 23 24 27 30
```

This aligns with the expected output as specified in your Python code.
