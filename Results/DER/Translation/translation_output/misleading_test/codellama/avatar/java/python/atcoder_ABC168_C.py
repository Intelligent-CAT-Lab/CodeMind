<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
-45.96915777646216

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
[/INST]
```python
import math

def main():
    a, b, tmp1, tmp2 = map(float, input().split())
    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m
    res = math.sqrt(a**2 + b**2 - (2. * a * b * math.cos(rad)))
    print(res)

if __name__ == '__main__':
    main()
```
Note that in Python, the `math` module is used for mathematical operations, and the `input()` function is used to read input from the user. The `map()` function is used to convert the input strings to floating-point numbers. The `if __name__ == '__main__':` block is used to execute the `main()` function when the script is run as a standalone program.</s>
