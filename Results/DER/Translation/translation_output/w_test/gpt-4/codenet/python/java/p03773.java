Here is the translated code in Java, complete with a sample test case:

```java
import java.util.Scanner;

public class TimeAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a + b) % 24);
    }
}
```

For the test input `9 12`, you would run the Java program, enter `9 12` when prompted for input and the program will output `21` as expected.

Please note that Java requires a bit more setup compared to Python, including the `import` statement for the `Scanner` class, a `class` definition, and wrapping the code in a `main` method.
