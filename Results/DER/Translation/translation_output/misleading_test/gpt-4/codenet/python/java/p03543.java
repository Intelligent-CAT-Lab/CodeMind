Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class ConsecutiveDigitsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: "); // Unlike Python, we typically prompt the user in Java
        String N = scanner.next(); // Reads input as string

        if (N.length() != 4) {
            System.out.println("Invalid input: Number must have exactly 4 digits.");
            return; // Exit if the input is not 4 digits
        }

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);

        if (a == b && b == c || b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
```

To test the code with the input '1118' in the terminal, you would:

1. Compile the code using `javac ConsecutiveDigitsChecker.java`.
2. Run the program with `java ConsecutiveDigitsChecker`.
3. When prompted, input `1118` and press enter. The output would be "No" (contrary to the "Yev" in your expected output, which seems to be a typo).

Remember that when using the Scanner class, it's a common practice to prompt the user with a Print statement so they know to provide an input.
