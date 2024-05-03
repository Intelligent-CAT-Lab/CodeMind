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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the ceiling of the division of the product of the two integers by 2, and prints the result. The `Math.ceil` function in Java is equivalent to the `ceil` function in Python. The `double` keyword is used to ensure that the division is performed as floating-point division, which is necessary to get the correct result when the product of the two integers is not a multiple of 2.
