Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println((3*a+p)/2);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result of the expression `(3*a+p)//2`, and prints the result. The `//` operator in Java is the integer division operator, which performs division and rounds down to the nearest whole number.
