Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(r * r);
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. The result of the square of the input number is then printed to the console using the `System.out.println()` method.
