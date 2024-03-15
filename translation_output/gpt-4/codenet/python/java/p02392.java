Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading integer values separated by spaces
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Conditional check
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

The code reads three integers from the input, then performs the comparison, and prints "Yes" if `a < b < c`, or "No" otherwise.
