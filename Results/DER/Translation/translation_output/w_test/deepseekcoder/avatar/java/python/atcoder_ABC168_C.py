<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
1.000076150972172


```
import java.util.Scanner;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double tmp1 = sc.nextDouble();
        double tmp2 = sc.nextDouble();
        
        double h = tmp1 / 6. * Math.PI + tmp2 / 30. * Math.PI / 12.;
        double m = tmp2 / 30. * Math.PI + tmp1 / 6. * Math.PI * 12.;
        double rad = h - m;
        
        double res = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2. * a * b * Math.cos(rad)));
        
        System.out.println(res);
    }
}
```

### Response:
```python
import math

def atcoder_ABC168_C(a, b, h, m):
    h = h / 60. * math.pi + m / 360. * math.pi
    m = m / 30. * math.pi + h / 12. * math.pi * 60.
    rad = h - m
    
    res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))
    
    return res

a, b, h, m = map(int, input().split())
print(f"{atcoder_ABC168_C(a, b, h, m):.6f}")
```

This Python code does the same thing as the Java code. It reads four integers from the input, calculates the difference in radians between the hour and minute hands of a clock, and then calculates the length of the hypotenuse of a right triangle with the two given sides and the angle between them. The result is printed with 6 decimal places.
<|EOT|>
