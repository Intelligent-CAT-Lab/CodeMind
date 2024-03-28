<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 9 0

Expected output:
5.00000000000000000000


```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```
[/INST]
```
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        double l = H * 360 / 12 + M * 30 / 60;
        double s = M * 360 / 60;
        double ang = Math.abs(l - s);
        double c = A * A + B * B - 2 * B * A * Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read the input from the user, and the `Math` class to perform the mathematical operations.

Note that the `Math.toRadians()` method is used to convert the angle from degrees to radians, which is required for the `Math.cos()` method.

Also, the `Math.sqrt()` method is used to calculate the square root of the value of `c`, which is the final output.</s>
