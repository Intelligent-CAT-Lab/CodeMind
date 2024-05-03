Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        char output = (char) (input + 1);
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads a character from the user, increments it by 1, and then prints the resulting character. The `Scanner` class is used to read input from the user, and the `charAt(0)` method is used to get the first character from the input string. The `(char)` cast is used to convert the integer value returned by the `ord()` function (which is equivalent to `ord()` in Python) to a character.
