Sure, here's the equivalent Java code that performs the same operation as the provided Python code:

```java
import java.util.Scanner;

public class CalculateDivisibleCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(inputParts[0]);
        int b = Integer.parseInt(inputParts[1]);
        int x = Integer.parseInt(inputParts[2]);
        
        int result = b / x - (a - 1) / x;
        
        System.out.println(result);
        
        scanner.close();
    }
}
```

This Java program reads a line of input, splits it into parts, parses the integer values, and computes the result before printing it. Note that in Java, integer division already behaves like floor division in Python, so there's no need to use different operations to achieve the "floor" effect.
