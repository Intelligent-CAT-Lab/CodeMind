Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(Math.max(a - b, a + b), a * b));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then prints the maximum of the three results of adding, subtracting, and multiplying the two numbers.
