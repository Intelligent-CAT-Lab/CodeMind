Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (int)Math.pow(2, 32) - 1;
        System.out.println(String.format("%032d", n));
        System.out.println(String.format("%032d", ~n & mask));
        System.out.println(String.format("%032d", (n << 1) & mask));
        System.out.println(String.format("%032d", (n >> 1) & mask));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, creates a mask with all bits set to 1, and then prints out the binary representation of the number, its bitwise complement, its left shift, and its right shift. The `String.format("%032d", n)` is used to print the binary representation of the number with leading zeros.
