Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        double mx = w / 2;
        double my = h / 2;
        double[] res = new double[2];
        res[0] = w * h / 2;
        if (x == mx && y == my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}
```

This Java code does the same thing as your Python code. It reads four double values from the standard input, calculates the result, and prints it out. The `Scanner` class is used to read the input values, and the `System.out.println` method is used to print the result. The `double` type is used to store the input and result values, and the `double[]` array is used to store the two results.
