Below is the Java translation of your Python code:

```java
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
```

This Java program assumes that you provide two integers as input separated by a space in the console, just like the Python code you've provided. You would run the Java program, input the two numbers (for example, "1 2") and press Enter, and it should output "a < b" as expected.
