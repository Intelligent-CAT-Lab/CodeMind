<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
1.00007615097217214106


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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);
        int m = Integer.parseInt(input[3]);

        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60)) / 12));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);

        double distance = Math.sqrt((x_h - x_m) * (x_h - x_m) + (y_h - y_m) * (y_h - y_m));
        System.out.println(distance);
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `String[] input` array is used to store the input values, and the `int a`, `int b`, `int h`, and `int m` variables are used to store the values of the input. The `double theta_h`, `double theta_m`, `double x_h`, `double y_h`, `double x_m`, and `double y_m` variables are used to store the intermediate values of the calculations. Finally, the `double distance` variable is used to store the final result, which is printed to the console using `System.out.println()`.</s>
