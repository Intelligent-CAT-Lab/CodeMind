<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
12.566371 12.566371


```
import math
    
r = float(input())
    
s = r * r * math.pi
    
l = r * 2 * math.pi
    
print('%.5f %.5f' % (s, l))
```
[/INST]
```
import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then calculates the area and perimeter of the circle using the formulae for the area and circumference of a circle. The results are then printed to the console with a precision of 5 decimal places.</s>
