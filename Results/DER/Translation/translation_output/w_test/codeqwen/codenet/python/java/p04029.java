Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)((n + 1) * n / 2));
    }
}
```

This Java code does the same thing as the Python code: it reads an integer from the user, calculates the sum of all integers from 1 to the input number (inclusive), and prints the result. The `Scanner` class is used to read input from the user, and the `System.out.println` method is used to print the result. The `(int)` cast is used to convert the result to an integer before printing it, since `System.out.println` expects a `String` argument.
