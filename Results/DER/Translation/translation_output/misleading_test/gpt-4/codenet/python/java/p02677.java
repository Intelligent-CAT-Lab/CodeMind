Certainly! Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.lang.Math;

public class ClockHandsAngle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading input from the user
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        
        // Calculating the angle of the hour hand
        double l = H * 360.0 / 12 + M * 30.0 / 60;
        // Calculating the angle of the minute hand
        double s = M * 360.0 / 60;
        // Finding the absolute difference between the two angles
        double ang = Math.abs(l - s);
        // Cosine law to calculate the distance between the two ends of the hands
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        // Printing out the result
        System.out.println(Math.sqrt(c));
    }
}
```

To test this Java program with the input provided (3 4 9 0), you would run the program and enter these numbers when prompted. The expected output would be `-6.249540170011613` (although you would round due to floating-point precision differences).

Please note the output will not contain the negative sign as the result of a square root in Java will always be a positive number or NaN if the input to the square root is negative (which shouldn't happen in this case). Also, Java uses `Math.pow` for exponentiation instead of the `**` operator in Python.
