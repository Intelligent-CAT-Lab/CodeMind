Here is the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the inputs as integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Determine the result based on the absolute difference
        String result = (Math.abs(a - b) > 1) ? "Alice" : "Brown";
        
        // Print the result
        System.out.println(result);
        
        // Close the scanner
        sc.close();
    }
}
```

To test this Java code, you can create a `Main` class and run it, providing the input when prompted:

Test input:
2 1

Expected output:
Brown
