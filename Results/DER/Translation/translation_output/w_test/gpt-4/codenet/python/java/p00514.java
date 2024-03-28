The following Java code performs the same computations as the provided Python code. It reads three integers from standard input, and then calculates and prints the result.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        
        int a = Math.min(n - 1, r - m * n);
        int b = Math.max(n - 1, r - m * n);
        
        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        
        long u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        
        System.out.println(a < 1 ? 0 : u / d);
        scanner.close();
    }
}
```

To test this Java code with the input "2 0 3", you would enter those numbers when prompted, and the expected output would be "4". Please note that the input must be provided manually when prompted by the program, or redirected from a file or another input source depending on how you run the Java program.
