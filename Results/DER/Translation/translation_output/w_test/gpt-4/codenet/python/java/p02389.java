Here's the Java version of the provided Python code. The Java code reads two integers from the console, calculates their product and the perimeter of a rectangle formed with these sides, and prints the results:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using scanner to get input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Performing calculations
        int product = a * b;
        int perimeter = (a + b) * 2;

        // Printing the results
        System.out.println(product + " " + perimeter);
    }
}
```

To compile and run this Java code, you'd use `javac` to compile and `java` to execute the `Main` class. Make sure that you have the Java Development Kit (JDK) installed on your system to use these commands.
