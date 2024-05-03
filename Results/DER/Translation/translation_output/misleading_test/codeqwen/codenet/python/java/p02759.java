Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = (n + 1) / 2.0;
        System.out.println((int) a);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, adds 1 to it, divides it by 2, and then prints the result as an integer. The `(int)` cast is used to ensure that the result is an integer.
