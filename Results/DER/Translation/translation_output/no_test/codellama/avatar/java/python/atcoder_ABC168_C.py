<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import math

a = float(input())
b = float(input())
tmp1 = float(input())
tmp2 = float(input())

h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
rad = h - m

res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))

print(res)
```
Note: The `math` module in Python provides the same mathematical functions as the `Math` class in Java, including `sqrt`, `pow`, and `cos`. The `input()` function in Python is used to read input from the user, and the `float()` function is used to convert the input to a floating-point number.</s>
