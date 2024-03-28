Certainly! Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class DifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
        
        scanner.close();
    }
}
```

This Java code is the equivalent of the Python code you've provided. It reads two integers from the standard input and prints the absolute difference between them.
