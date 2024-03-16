Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class ZeroFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xList = new int[5];

        // Read integers from input
        for (int i = 0; i < 5; i++) {
            xList[i] = scanner.nextInt();
        }

        // Look for the zero and output its position
        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
                break; // Stop after finding the first zero.
            }
        }
        
        scanner.close(); // Close the scanner
    }
}
```

To run this Java code with your test input, you would provide the input (0 2 3 4 5) on standard input (e.g., typing it into the console after the program starts or piping it in from a file). Remember that Java is a compiled language, so you'll need to compile this code before running it.

To compile and run the Java code, use the following commands in your terminal or command prompt, assuming the code is saved in a file named `ZeroFinder.java`:

```sh
javac ZeroFinder.java
java ZeroFinder
```

Then enter the test input `0 2 3 4 5`, and you should receive the expected output `1`.
