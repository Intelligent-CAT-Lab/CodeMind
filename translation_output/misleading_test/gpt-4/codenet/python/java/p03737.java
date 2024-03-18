Below is the translation from the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read input

        // Read the input string and split it into an array
        String[] inputParts = scanner.nextLine().toUpperCase().split(" ");

        // Build the output using the first character of each string
        String output = "";
        for (String part : inputParts) {
            output += part.charAt(0);
        }

        // Print the output
        System.out.println(output);

        scanner.close(); // Close the scanner to release resources
    }
}
```

You can test the Java code with the sample input "atcoder beginner contest" and the expected output should be "AWBC".
