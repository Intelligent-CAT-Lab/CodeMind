<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

import math
a , b , h , m = map ( int , input ( ) . split ( ) )
theta_h = 2.5 * math . pi - ( 2 * math . pi * ( ( h + ( m / 60 ) ) / 12 ) )
theta_m = 2.5 * math . pi - ( 2 * math . pi * ( m / 60 ) )
x_h = a * math . cos ( theta_h )
y_h = a * math . sin ( theta_h )
x_m = b * math . cos ( theta_m )
y_m = b * math . sin ( theta_m )
print ( ( ( x_h - x_m ) ** 2 + ( y_h - y_m ) ** 2 ) ** 0.5 )



Translate the above python code to java.

java Code:

[/INST]

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
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

Note: The above code is written in Java 8, if you are using an older version of Java, you may need to modify the code accordingly.</s>
