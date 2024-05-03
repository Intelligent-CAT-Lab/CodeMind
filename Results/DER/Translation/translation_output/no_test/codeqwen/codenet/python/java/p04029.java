Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)((n + 1) * n / 2.0));
    }
}
```

In Java, we use `Scanner` to get user input. The `nextInt()` method is used to get an integer input from the user. The `System.out.println()` method is used to print the output. The `(int)` cast is used to convert the result of the calculation to an integer. The `/ 2.0` is used to ensure that the division is done as floating-point division, which gives a more accurate result.
