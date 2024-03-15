Below is the Java equivalent of the Python code you've provided. The Java version uses `java.util.Scanner` to read from standard input, and `java.lang.Math` for the square root operation:

```java
import java.util.Scanner;

public class CalculateSquare {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine().trim());
      int a = (int)Math.sqrt(n);

      System.out.println(a*a);

      scanner.close();
   }
}
```

This code snippet performs the following steps:

1. Imports the necessary classes (`java.util.Scanner` for input and `java.lang.Math` for the square root operation).
2. Declares the `CalculateSquare` class and the `main` method with `String[] args` as the parameter as the program entry point.
3. Creates a `Scanner` object to read from the standard input (stdin).
4. Reads an integer value from stdin and trims any trailing whitespace characters.
5. Calculates the integer square root of the input number using `Math.sqrt`. The result is then explicitly cast to an integer, which truncates any decimal part.
6. Prints the square of the calculated integer square root.
7. Lastly, closes the `Scanner` object to avoid resource leaks.

Note that Java is strictly typed, and the result of `Math.sqrt` is a `double`, so we must cast it to an `int` manually to match the Python behavior of the `np.sqrt` function, which is inferred to return an integer when used in this context. We also ensure that the printed result is the square of the truncated square root value.
