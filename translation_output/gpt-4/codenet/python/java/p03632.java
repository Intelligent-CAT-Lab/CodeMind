Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class OverlappingSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integers A, B, C, and D as input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        // Calculate the answer
        int ans = Math.min(B, D) - Math.max(A, C);
        
        // Print the result based on the condition
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
        
        // Close the scanner
        scanner.close();
    }
}
```

Make sure to run this Java code within the context of a class, as Java is a class-based language and code must be executed within the context of a class and method.
