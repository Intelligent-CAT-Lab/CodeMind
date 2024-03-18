Below is the Java translation of the provided Python code. It reads input from the console, calculates the distance between two points, and prints the result formatted to six decimal places.

```java
import java.util.Scanner;
import java.lang.Math;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        System.out.printf("%.6f\n", distance);
        
        scanner.close();
    }
}
```

To run this code with the provided test input, you will need to use the standard input stream and provide the values `0 0 1 1`. If running this program from the command line in an environment where you compile and run Java code, you could do something like:

```
echo "0 0 1 1" | java DistanceCalculator
```

This would compile the code into a class named `DistanceCalculator`, execute it, and pass the test input through as if it were typed into the console. The expected output should be `49.63264320801141`, as per your request.
