Here is the Java translation of your provided Python code with a simple test case encompassed within a `main` method:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if(A != B) {
            int x = (A * A - B * B) / (2 * (A - B)); // In Java, integer division results in an integer
            double exactValue = ((double) A * A - (double) B * B) / (2 * (A - B));
            if (exactValue == x) {
                System.out.println(x);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } else {
            // Handling the situation where A equals B to prevent division by zero
            System.out.println("IMPOSSIBLE");
        }
    }
}
```
To test with the input `2 16` you can either pass the input directly if you're running it via the command line or a file, or manually change the scanner inputs to static values in the code for testing purposes. Here we encapsulate the implementation in a `main` method so it can be run as a standalone program.

Java requires strict type handling, so the division yields an integer value if both operands are integers. To check if `x` represents the exact division result and not a truncated one, we cast `A` and `B` to `double` before performing the division. This allows us to determine if the exact result is an integer or not. Also, unlike Python, Java requires explicit error handling for cases where division by zero might occur (when `A` equals `B`), hence the added condition.
