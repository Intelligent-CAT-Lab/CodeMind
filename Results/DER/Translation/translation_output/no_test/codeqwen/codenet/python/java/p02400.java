Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;

        System.out.printf("%.5f %.5f", s, l);
    }
}
```

In this Java code, we use `Scanner` to get the input from the user. The `Math.PI` constant is used to get the value of pi. The `System.out.printf` method is used to print the results with 5 decimal places.
