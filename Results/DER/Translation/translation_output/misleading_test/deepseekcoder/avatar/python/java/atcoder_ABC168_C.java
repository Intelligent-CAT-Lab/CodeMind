<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
-29.65730865197496

```
import math
a , b , h , m = map ( int , input ( ) . split ( ) )
theta_h = 2.5 * math . pi - ( 2 * math . pi * ( ( h + ( m / 60 ) ) / 12 ) )
theta_m = 2.5 * math . pi - ( 2 * math . pi * ( m / 60 ) )
x_h = a * math . cos ( theta_h )
y_h = a * math . sin ( theta_h )
x_m = b * math . cos ( theta_m )
y_m = b * math . sin ( theta_m )
print ( ( ( x_h - x_m ) ** 2 + ( y_h - y_m ) ** 2 ) ** 0.5 )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        double theta_h = 2.5 * Math.PI - ( 2 * Math.PI * ( ( h + ( m / 60.0 ) ) / 12 ) );
        double theta_m = 2.5 * Math.PI - ( 2 * Math.PI * ( m / 60.0 ) );
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);

        double distance = Math.sqrt(Math.pow((x_h - x_m), 2) + Math.pow((y_h - y_m), 2));
        System.out.println(distance);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the distances between the two hands of a clock and prints the distance between them. The distance is calculated using the formula for the Euclidean distance in a 2D space.
<|EOT|>
