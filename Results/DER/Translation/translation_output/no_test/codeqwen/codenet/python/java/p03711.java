Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = System.console().readLine();
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> b = Arrays.asList(4, 6, 9, 11);
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (a.contains(x) && a.contains(y) || b.contains(x) && b.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the console, checks if they are in the lists `a` and `b`, and prints "Yes" or "No" accordingly.
