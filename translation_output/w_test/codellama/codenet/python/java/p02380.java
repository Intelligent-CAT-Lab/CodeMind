<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.00000000
12.00000000
3.00000000


```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result1 = 0.5*a*b*Math.sin(Math.toRadians(c));
        double result2 = a+b+(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)))**0.5;
        double result3 = b*Math.sin(Math.toRadians(c));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```
Note: The `Math.toRadians()` method is used to convert the angle from degrees to radians, which is required for the `Math.sin()` and `Math.cos()` methods.</s>
