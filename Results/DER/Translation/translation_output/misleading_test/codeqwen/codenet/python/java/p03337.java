Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
    }
}
```

This Java code does the same thing as the Python code: it reads two integers from the user, calculates the maximum of the sum, difference, and product of these two integers, and then prints the result.
