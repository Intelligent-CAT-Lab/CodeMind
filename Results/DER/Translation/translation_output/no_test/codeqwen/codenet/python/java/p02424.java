Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0], 2);
        int b = Integer.parseInt(input[1], 2);

        System.out.println(String.format("%032d", a & b));
        System.out.println(String.format("%032d", a | b));
        System.out.println(String.format("%032d", a ^ b));
    }
}
```

This Java code does the same thing as your Python code. It reads two binary numbers from the user, converts them to integers, performs the bitwise AND, OR, and XOR operations, and then prints the results in binary format with leading zeros.
