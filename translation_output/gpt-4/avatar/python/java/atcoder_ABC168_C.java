Below you can find the Python code translated into Java. Please note that Java has a strict type system, so we need to define the types of each variable. Moreover, Java uses `Scanner` for input and `System.out.println` for output, and we must use `Math.pow()` instead of the ** operator for exponentiation, and `Math.sqrt()` to find the square root.

```java
import java.util.Scanner;
import java.lang.Math;

public class AngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input similar to the Python version (separated by space)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        
        // Calculating thetas
        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60.0)) / 12));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60.0));
        
        // Calculating the x and y coordinates
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        
        // Calculating and printing the distance
        double distance = Math.sqrt(Math.pow((x_h - x_m), 2) + Math.pow((y_h - y_m), 2));
        System.out.println(distance);
    }
}
```

You would also need to save this code into a `.java` file, name it `AngleCalculator.java`, compile it with `javac AngleCalculator.java`, and run it with `java AngleCalculator` to see the results. Depending on your environment, you may also need to tweak the input and output handling.
