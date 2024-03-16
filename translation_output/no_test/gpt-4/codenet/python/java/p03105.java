Here's the equivalent Java code of your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Conditional check and output
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
        
        // Close the scanner
        scanner.close();
    }
}
```

In Java, we use a `Scanner` object to read input from the user. Unlike Python, Java requires explicit type definitions, and we use `System.out.println` to output the results. Note that the integer division in Java automatically discards the remainder, akin to `//` in Python.
