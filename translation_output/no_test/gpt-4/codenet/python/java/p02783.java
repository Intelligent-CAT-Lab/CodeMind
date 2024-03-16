Here's the translated code in Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        int H = scanner.nextInt();
        int A = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();
        
        // Calculate the ceiling of H/A
        int result = (int)Math.ceil((double)H/A);

        // Print the result
        System.out.println(result);
    }
}
```

Keep in mind that Java is a statically typed language, so you need to specify the types for variables. Additionally, Java math operations between integers result in another integer, so to perform ceiling after division, you have to explicitly cast at least one operand to a double to ensure floating-point division happens before taking the ceiling.
