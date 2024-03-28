<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
1.00007615097217214106


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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60.0)) / 12.0));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60.0));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt((x_h - x_m) * (x_h - x_m) + (y_h - y_m) * (y_h - y_m)));
    }
}
```
<|endoftext|>
