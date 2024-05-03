Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int r = Integer.parseInt(inputs[2]);
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the result, and prints it with 6 decimal places. The `printf` method is used to print the result with the specified format.
