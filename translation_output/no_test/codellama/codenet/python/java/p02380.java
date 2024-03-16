<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double area = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double perimeter = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double height = b * Math.sin(Math.toRadians(c));
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(height);
    }
}

Note: The above code uses the `Math.toRadians()` method to convert the angle `c` from degrees to radians, which is necessary for the `Math.sin()` and `Math.cos()` methods to work correctly.</s>
