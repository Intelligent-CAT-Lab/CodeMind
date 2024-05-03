Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int r2 = Integer.parseInt(input[1]);
        System.out.printf("%.10f", 1.0 / ((r2 + r1) / (r1 * r2)));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the result, and prints it with 10 decimal places. The `printf` method is used to print the result with the desired precision.
