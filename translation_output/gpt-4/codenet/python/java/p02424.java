Here is the translated code in Java:

```java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by space
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Printing the results in 32-bit binary format
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it takes two integers as input, then prints the result of bitwise AND, OR, and XOR operations on the two numbers, each formatted to a 32-bit binary string with leading zeros.
