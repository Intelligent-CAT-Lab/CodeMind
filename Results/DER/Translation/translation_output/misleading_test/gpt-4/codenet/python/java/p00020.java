Here's the Java version of the provided Python code. The Java program reads a line from the standard input, converts it to uppercase, and prints it to the standard output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String uppercaseLine = inputLine.toUpperCase();
        System.out.println(uppercaseLine);
        scanner.close();
    }
}
```

This program will behave the same as the given Python code when provided with the test input "this is a pen.". The expected output will be "THIS IS A PEN.".
