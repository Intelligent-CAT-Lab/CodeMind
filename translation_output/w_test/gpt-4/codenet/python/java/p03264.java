Certainly! Below is the Java equivalent of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k / 2.0) * (k / 2));
    }
}
```

Please note that in Java the `Scanner` class is used for taking input and `System.out.println()` is used for printing the output. Also, the division operation behaves differently in Java than in Python; to replicate the `math.ceil` behavior, we explicitly cast one of the numbers as a double, or use `2.0` and then cast the result back to an `int`. The `(k / 2)` expression in Java performs integer division if both operands are integers, similar to the `//` operator in Python.
