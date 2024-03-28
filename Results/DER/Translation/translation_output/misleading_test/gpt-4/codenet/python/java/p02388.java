Below is the translated code in Java. I've assumed we are using Java 8 or newer, based on your request not specifying a particular version.

```java
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x * x * x);
        scanner.close();
    }
}
```

Java requires a class definition (`CubeCalculator` in this case) and a `main` method to run the code. We also use the `Scanner` class from `java.util` package to read the integer input from the standard input (`System.in`), similar to `raw_input()` in Python.

To compile and run this Java program, you might use the following commands:

```shell
javac CubeCalculator.java
java CubeCalculator
```

Then, as the program waits for input, entering `2` should produce the expected output `8` (not `12` as you mentioned in your example - since we're calculating the cube of the input, 2^3 equals 8).
