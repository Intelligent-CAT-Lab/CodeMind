Here's the Python code translated to Java including the main method and standard input handling:

```java
import java.util.Scanner;

public class DifferenceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for getting input from the user
        Scanner scanner = new Scanner(System.in);

        // Read two integer values
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate and print the absolute difference between the two numbers
        System.out.println(Math.abs(a - b));

        // Close the Scanner
        scanner.close();
    }
}
```

Here is an example of how you would run this Java program with the test input "20 30" (assuming the program is compiled and the class file is named `DifferenceCalculator.class`):

```
echo "20 30" | java DifferenceCalculator
```

And the program would output the expected result:

```
2
```
