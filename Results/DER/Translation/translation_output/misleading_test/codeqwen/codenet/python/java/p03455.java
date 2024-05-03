Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```

This Java program does the same thing as your Python program. It reads two integers from the user, multiplies them, and then checks if the result is odd or even. If the result is odd, it prints "Odd", otherwise it prints "Even".
