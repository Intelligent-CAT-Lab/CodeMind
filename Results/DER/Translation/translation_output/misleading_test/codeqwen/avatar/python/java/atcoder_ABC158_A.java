Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = " Yes " if (s.contains("A") && s.contains("B")) ? " Yes " : " No ";
        System.out.println(result);
    }
}
```

Please note that in Java, we use `System.in` to read from the standard input, and `System.out.println` to print to the standard output. The `Scanner` class is used to read input from the user. The `contains` method is used to check if a string contains a specific sequence of characters. The ternary operator `? :` is used to simplify the if-else statement.
