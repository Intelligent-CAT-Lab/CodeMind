Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;
import static java.lang.Math.PI;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for A and B separated by space:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double volume = 4.0 / 3.0 * PI * Math.pow(B, 3);
        
        System.out.printf("%.10f", volume);
        scanner.close();
    }
}
```

This Java code includes the necessary imports, reads two floating-point numbers `A` and `B`, computes the volume of a sphere with radius `B`, and prints the result with 10 decimal places. The `A` value is read because it's present in the Python snippet, but it's not used in the calculation as the code is only interested in the variable `B` for calculating the volume.
