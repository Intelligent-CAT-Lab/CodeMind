Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * M);
    }
}
```

In this Java code, we are using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the integer values entered by the user. The `System.out.println()` method is used to print the result of the multiplication of `N` and `M`.
