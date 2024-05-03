Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & (-(n + 1)));
    }
}
```

This Java code does the same thing as the Python code: it reads an integer from the user, adds 1 to it, and then applies the bitwise AND operation with the bitwise NOT of the result. The bitwise NOT operation inverts all the bits of the number, so the result of the bitwise AND operation will be the least significant bit of the original number.
