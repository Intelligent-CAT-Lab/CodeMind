Here is the Python code translated into Java:

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

        foo(a, b, c);

        scanner.close();
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

This Java code defines a class `Main` with the `main` method to read three integers `a`, `b`, and `c` from the console input, then calls the `foo` method, which checks if `c` can be found as a remainder of `a` modulo `b` by increments of the initial remainder. If found, it prints `YES`; otherwise, it prints `NO`. The code uses a `HashSet` to keep track of the remainders that have been seen already.
