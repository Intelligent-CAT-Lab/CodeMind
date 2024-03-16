Below is the equivalent Java code for the provided Python code. Please note that Java requires specific types for variables and the use of semicolons to end statements.

```java
import java.util.Scanner;

public class IncreaseSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Time
        double s = scanner.nextDouble(); // Speed
        double q = scanner.nextDouble(); // Increase factor
        scanner.close();
        
        double v = (q - 1) / q;
        int tm = 1;
        double t = s / (1 - v);
        
        while ((T - s) / v - t > 0) {
            // Comparing with a small epsilon because floating point
            // arithmetic can lead to precision issues
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = s / (1 - v);
        }
        
        System.out.println(tm);
    }
}
```

When you run this Java code with the sample test input `100000 3125 2`, the expected output will be `5`. Make sure to provide the input in the same line separated by spaces.
