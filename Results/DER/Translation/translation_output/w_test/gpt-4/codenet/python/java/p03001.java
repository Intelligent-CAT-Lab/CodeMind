Here is the Java equivalent of the provided Python code:

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
        double area = w * h / 2;
        int correct = 0;

        if (x == mx && y == my) {
            correct = 1;
        }

        System.out.printf("%.6f %d\n", area, correct);
    }
}
```

This Java program replicates the functionality of the given Python code, reading from standard input and computing the area and checking the condition regarding the point being in the middle of the rectangle. In Java, you need to use the `Scanner` class to handle the input. The `printf` method is used for formatted output, similar to the `print` function in Python.
