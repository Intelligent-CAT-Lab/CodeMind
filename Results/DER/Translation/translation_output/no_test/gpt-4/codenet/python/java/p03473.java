Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        System.out.println(48 - M);
        scanner.close();
    }
}
```

Make sure to create a `Main` class where the Java code resides, as Java code execution begins from the `main` method. The `Scanner` class from `java.util` package is used to handle input in Java. After reading the integer, we output the result of `48 - M` to the console, and finally, we close the scanner to prevent resource leaks.
