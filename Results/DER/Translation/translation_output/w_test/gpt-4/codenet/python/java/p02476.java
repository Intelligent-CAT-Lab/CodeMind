Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class ModuloCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Close the scanner
        scanner.close();

        // Print the result of a modulo b
        System.out.println(a % b);
    }
}
```

This Java program will read two integers from standard input and then print the result of `a` modulo `b` to the standard output. Please remember to use this code with a class name that matches your file name in Java, as the above code uses the class name `ModuloCalculator`.
