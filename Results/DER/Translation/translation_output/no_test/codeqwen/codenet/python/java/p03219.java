Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        
        int fare = (int) (ab + bc / 2.0);
        
        System.out.println(fare);
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `nextInt()` method is used to read the integer input. The `/` operator performs integer division in Java, so we need to cast one of the operands to `double` to get a floating-point result. The `(int)` cast then truncates the result to an integer.
