Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result = input * 6.28;
        System.out.println((int)result);
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, multiplies it by 6.28, and then prints the result as an integer. The `(int)` cast is used to ensure that the result is an integer.
