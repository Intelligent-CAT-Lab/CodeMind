Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((double) (-(-N / 2)) / N);
    }
}
```

In Java, we use `Scanner` to get user input. The `nextInt()` method is used to get an integer input from the user. The `System.out.println()` method is used to print the result. The `(double)` cast is used to ensure that the division operation returns a double value.
