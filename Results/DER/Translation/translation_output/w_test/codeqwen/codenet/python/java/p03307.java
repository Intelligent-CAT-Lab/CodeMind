Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```

This Java program does the same thing as your Python code. It reads an integer from the user, checks if it's even or odd, and then prints the result. If the number is even, it prints the number itself. If the number is odd, it prints twice the number.
