Here's the Java equivalent of the Python code you provided. Java requires specifying the type for each variable and uses different methods for input and output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```

This Java code will read an integer from the standard input, perform the calculation, and print the result to the standard output, just like the Python code does. The `Scanner` class is used for input, and `System.out.println` is used for output in Java. Make sure to close the scanner with `scanner.close()` if you are done with scanning inputs to avoid resource leaks. In this minimal example, it is not shown, because the program ends right after, and resources are freed by the JVM.
