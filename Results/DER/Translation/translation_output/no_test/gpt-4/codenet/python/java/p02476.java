Here's the equivalent Java code that achieves the same functionality as the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println(a % b);
    }
}
```

This Java program reads two integer values from the standard input, calculates the modulus of the first number by the second one, and prints the result.
