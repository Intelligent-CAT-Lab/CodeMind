Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toUpperCase();
        System.out.println(a);
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextLine()` method is used to read the entire line of input, and the `toUpperCase()` method is used to convert the input to uppercase. The result is then printed to the console using the `System.out.println()` method.
