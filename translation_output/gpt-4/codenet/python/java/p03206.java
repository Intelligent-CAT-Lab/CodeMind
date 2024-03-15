Here's how you would translate the given Python code into Java:

```java
import java.util.Scanner;
import java.util.HashMap;

public class ChristmasDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();

        HashMap<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");

        System.out.println(d.get(D));

        scanner.close();
    }
}
```

Please note the following differences between Python and Java:

1. Java is a statically typed language, and variable types must be declared.
2. Java uses `HashMap` instead of Python dictionaries.
3. Java uses `System.out.println` for output instead of `print`.
4. Java requires a class declaration and a `main` method to run code.
5. Java requires importing specific classes to be used, such as `Scanner` for input and `HashMap` for map functionalities.
6. Java codes are enclosed in curly braces `{}` to define code blocks.
