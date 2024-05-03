Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's equal to 1, and if it is, it prints "Hello World" and exits the program. If the integer is not 1, it reads two more integers from the user and prints their sum.
