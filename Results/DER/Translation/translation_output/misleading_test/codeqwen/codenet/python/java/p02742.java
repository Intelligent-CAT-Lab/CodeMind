Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(Math.ceil((double)H*W/2));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result, and prints it to the standard output. The `Math.ceil` function is used to round up the result to the nearest whole number.
