Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the answer, and prints it out with 6 decimal places. The `printf` method is used to print the answer with the desired precision.
