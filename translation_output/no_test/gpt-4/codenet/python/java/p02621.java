The equivalent Java code would look something like this:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int result = a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3);
        System.out.println(result);
    }
}
```

This Java program does the following:
1. Imports the `Scanner` class for input.
2. Defines a `Main` class and a `main` method, which is the entry point for the program.
3. Creates a `Scanner` object to read from the standard input (keyboard).
4. Prompts the user for an integer.
5. Reads the integer.
6. Calculates `a + a^2 + a^3` (where `^` denotes the power operation).
7. Prints the result.
8. Note that we have to cast `Math.pow(a, 2)` and `Math.pow(a, 3)` to an `int` because the `Math.pow` method returns a `double`.
