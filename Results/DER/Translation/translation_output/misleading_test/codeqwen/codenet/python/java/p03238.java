Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            return;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's 1, and if so, prints "Hello World". If it's not 1, it reads two more integers and prints their sum.
