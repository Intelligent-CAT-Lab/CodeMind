Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        System.out.println((double)t/x);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, divides the first by the second, and prints the result. The `(double)` cast is necessary to ensure that the division is performed as floating-point division, not integer division.
