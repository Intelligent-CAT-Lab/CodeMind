Below is the equivalent Java code that provides the same functionality as the Python code you've provided:

```java
import java.util.Scanner;

public class ClosestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println('A');
        } else {
            System.out.println('B');
        }
        
        scanner.close();
    }
}
```

This Java program uses the `Scanner` class to read integer inputs from the user and the `Math.abs` method to calculate absolute values. It then compares the absolute differences and prints 'A' or 'B' accordingly.
