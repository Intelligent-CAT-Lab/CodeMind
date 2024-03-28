Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

For a test input of `1`, this Java program will print `Hello World` just as the Python script does. Remember that unlike Python, which uses indentation to define code blocks, Java uses curly braces `{}`. Additionally, Java is static-typed, so you must declare the variable types before using them. In Java, `System.exit(0);` is used to exit the program. Also, you need to import the `Scanner` class before using it for input handling.
