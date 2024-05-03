Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format("%032d", a & b));
        System.out.println(String.format("%032d", a | b));
        System.out.println(String.format("%032d", a ^ b));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, performs the bitwise AND, OR, and XOR operations on them, and then prints the results in binary format with leading zeros. The `String.format` method is used to format the binary strings with leading zeros. The `%032d` format specifier means "32-character decimal number".
