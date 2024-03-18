Below is the Python code translated to Java, along with code to read the input and produce the expected output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
        scanner.close();
    }
}
```

This Java program will read two integers from the standard input, multiply them, and print the result to the standard output, as in the provided Python code. The `Scanner` class is used to parse primitive types and strings using regular expressions. After using the `Scanner`, it should be closed because it wraps an underlying I/O resource (`System.in` in this case).
