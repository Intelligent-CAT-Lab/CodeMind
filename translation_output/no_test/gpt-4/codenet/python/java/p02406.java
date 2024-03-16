Below is the equivalent code translated from Python to Java. I have adapted it so that it performs the same function using Java syntax and conventions.

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
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
        if (!A.isEmpty()) {
            System.out.println(A.get(A.size() - 1));
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
```

Note that Java uses typed lists (e.g., `ArrayList<Integer>` instead of Python's untyped lists), and you need to create an instance of `Scanner` to handle input. Additionally, the `System.out.print` and `System.out.println` methods are used to print without and with a newline, respectively. Also, I have enclosed the code in a `main` method within a `Main` class, as is standard in Java for runnable applications.
