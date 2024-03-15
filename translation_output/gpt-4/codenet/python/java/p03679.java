Below is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class FoodSafety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
        
        scanner.close();
    }
}
```

This Java code does the same thing as the original Python code. It reads three integers (`x`, `a`, `b`) from the standard input, then it determines which message to print out based on the conditions provided in the if-else statement, which checks the difference between `b` and `a` against the value of `x`.
