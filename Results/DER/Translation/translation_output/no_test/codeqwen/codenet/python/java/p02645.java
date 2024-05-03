Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, 3));
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextLine()` method is used to read the entire line of input, and the `substring(0, 3)` method is used to get the first three characters of the input. The result is then printed to the console using `System.out.println()`.
