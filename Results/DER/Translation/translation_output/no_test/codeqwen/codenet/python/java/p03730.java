Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

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

This Java code does the same thing as your Python code. It reads three integers from the user, then calls the `foo` method with these integers. The `foo` method calculates the remainder of `a` divided by `b`, then iterates from this remainder to `c` in steps of `b`. If it finds `c` in the iteration, it prints "YES" and returns. If it doesn't find `c` in the iteration, it prints "NO".
