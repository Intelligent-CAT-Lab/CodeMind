Here's the Python code translated into Java with a sample test case implemented through a main method:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input is given in the same line separated by spaces, as in the Python example:
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        // Compute the result using integer division
        int result = b / x - (a - 1) / x;

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}
```

In the above Java code, `Scanner` is used to read input from standard input (same as `input().split(" ")` in Python), and `nextInt()` method is used to read the next integer from the input. Integer division is used directly with `/` since Java's `/` operator performs integer division when the operands are integers (corresponding to the `//` operator in Python).

To test the program with the provided input "4 8 2":

Input:
```
4 8 2
```

The expected output would be "14", as calculated by the Java program.
