Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double l = H*360.0/12 + M*30.0/60;
        double s = M*360.0/60;
        double ang = Math.abs(l-s);
        double c = A*A + B*B -2*B*A*Math.cos(Math.toRadians(ang));
        System.out.printf("%.16f", Math.sqrt(c));
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, calculates the angle between the hour and minute hands of a clock, and then calculates the distance between the centers of the clock's hands. The result is printed to the standard output with 16 decimal places.
