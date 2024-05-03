Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a < b ? 0 : 10);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, and then prints 0 if the first integer is less than the second, or 10 otherwise. The `Scanner` class is used to read input from the user, and the `System.out.println` method is used to print output to the console. The `? :` operator is used to perform a conditional expression in Java, similar to the ternary operator in Python.
