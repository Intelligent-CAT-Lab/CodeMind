Here is the equivalent Java program for the Python code given:

```java
import java.util.Scanner;
import java.lang.Math;

public class AngleBetweenClockHands {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // Length of hour hand
        int B = scanner.nextInt(); // Length of minute hand
        int H = scanner.nextInt(); // Hour
        int M = scanner.nextInt(); // Minute
        scanner.close();
        
        double longHandPosition = H * 360 / 12 + (M * 360 / 12) / 60;
        double shortHandPosition = M * 360 / 60;
        double angle = Math.abs(longHandPosition - shortHandPosition);
        
        double c = Math.pow(A, 2) + Math.pow(B, 2)
                    - 2 * A * B * Math.cos(Math.toRadians(angle));
        
        System.out.printf("%.20f%n", Math.sqrt(c));
    }
}
```

Make sure to use the `Scanner` class to take input from the command line and utilize `Math` functions for various mathematical operations.

Here's how the test case would work out:

Test input:
3 4 9 0

Expected output:
5.00000000000000000000

Ensure you compile and run the Java code with the test input to verify that you get the expected output.
