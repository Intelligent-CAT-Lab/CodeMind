<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))



Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;
import java.lang.Math;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println(distance);
    }
}

The Java code uses the `Scanner` class to read input from the user, and the `Math` class to calculate the distance between two points. The `Math.sqrt()` method is used to calculate the square root of the sum of the squares of the differences between the x and y coordinates of the two points. The `System.out.println()` method is used to print the distance to the console.</s>
