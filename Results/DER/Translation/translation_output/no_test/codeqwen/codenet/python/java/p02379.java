Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        double x1 = Double.parseDouble(inputs[0]);
        double y1 = Double.parseDouble(inputs[1]);
        double x2 = Double.parseDouble(inputs[2]);
        double y2 = Double.parseDouble(inputs[3]);
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.printf("%.6f", distance);
    }
}
```

This Java code does the same thing as your Python code. It reads four double values from the user, calculates the distance between the two points, and prints the result with 6 decimal places.
