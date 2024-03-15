Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        System.out.println((n == 0) ? 1 : (2 / n));
        
        scanner.close();
    }
}
```

Keep in mind that the Java version is more verbose and strictly typed. The `Scanner` class is used for input, and we use a ternary operator `(condition) ? expressionIfTrue : expressionIfFalse` to mimic the behavior of the Python one-liner. The `System.out.println` is used to print the output.
