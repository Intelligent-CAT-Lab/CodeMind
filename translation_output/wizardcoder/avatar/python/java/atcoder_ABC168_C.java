Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a, b, h, m = map ( int, input ( ). split ( ) )
theta_h = 2.5 * math. pi - ( 2 * math. pi * ( ( h + ( m / 60 ) ) / 12 ) )
theta_m = 2.5 * math. pi - ( 2 * math. pi * ( m / 60 ) )
x_h = a * math. cos ( theta_h )
y_h = a * math. sin ( theta_h )
x_m = b * math. cos ( theta_m )
y_m = b * math. sin ( theta_m )
print ( ( ( x_h - x_m ) ** 2 + ( y_h - y_m ) ** 2 ) ** 0.5 )


```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, h, m, theta_h, theta_m, x_h, y_h, x_m, y_m;
        a = input.nextDouble();
        b = input.nextDouble();
        h = input.nextDouble();
        m = input.nextDouble();
        theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60)) / 12));
        theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60));
        x_h = a * Math.cos(theta_h);
        y_h = a * Math.sin(theta_h);
        x_m = b * Math.cos(theta_m);
        y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt((x_h - x_m) * (x_h - x_m) + (y_h - y_m) * (y_h - y_m)));
    }
}
```<|endoftext|>
