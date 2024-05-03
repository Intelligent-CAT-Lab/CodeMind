Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n == 0 ? 1 : 2 / n);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's equal to 0, and if it is, it prints 1. If it's not, it divides 2 by the input number and prints the result.
