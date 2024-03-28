Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        scanner.close();
        
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        
        System.out.printf("%.5f %.5f\n", s, l);
    }
}
```

You can use this Java code to perform the same calculations as the Python code. When running this code, it expects a floating-point number as input, just like the Python code, which represents the radius of a circle and outputs the area (`s`) and the circumference (`l`) with five decimal places of precision.
