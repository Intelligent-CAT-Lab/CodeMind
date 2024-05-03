Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        System.out.println(A.multiply(B));
    }
}
```

This Java code does the same thing as the Python code. It reads two space-separated numbers from the standard input, converts them to `BigDecimal` objects, and then multiplies them together. The result is printed to the standard output. The `BigDecimal` class is used instead of `Decimal` because Java does not have a built-in `Decimal` class.
