Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & (n + 1));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, adds 1 to it, and then applies the bitwise AND operation to the result. The bitwise AND operation is performed using the '&' operator in Java. The result is then printed to the console.
