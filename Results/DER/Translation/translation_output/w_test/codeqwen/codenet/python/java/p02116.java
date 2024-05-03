Here is the Java equivalent of the Python code you provided:

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

This Java code does the same thing as the Python code. It reads an integer from the user, adds 1 to it, and then uses the bitwise AND operator to find the least significant bit that is set to 1 in the binary representation of the number. This bit is the highest bit that is not set to 1, and it is the only bit that will be set to 1 after performing the bitwise AND operation. The result is printed to the console.
