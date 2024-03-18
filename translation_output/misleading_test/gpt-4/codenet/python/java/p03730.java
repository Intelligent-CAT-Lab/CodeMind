Below is the equivalent Java code for the provided Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        foo(a, b, c);
    }

    public static void foo(int a, int b, int c) {
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;

        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

This Java code sets up a Scanner to parse the input, defines the `foo` method equivalent to the Python function, and uses a Set to track "seen" remainders, just like the Python code. Remember that, unlike Python which uses indentation to denote block structure, Java uses curly braces `{}`. Additionally, where Python uses dynamic typing, Java requires explicit type declarations. Also, Java uses `System.out.println` for printing output to the console, and it is necessary to close the Scanner to prevent any leaks.
