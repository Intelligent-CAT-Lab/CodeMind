<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
12.566371 12.566371 -41.56522714013986

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class p02400{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double pi = Math.PI;
		double x = r*r*pi;
		double y = 2*r*pi;
		System.out.printf("%.6f %.6f",x,y);
	}
}
```

### Response:
```python
import math

def calculate_circle_properties(r):
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    return round(x, 6), round(y, 6)

r = float(input())
x, y = calculate_circle_properties(r)
print(x, y)
```

In this Python code, we first import the `math` module to get the value of pi. Then we define a function `calculate_circle_properties` that takes a radius `r` as input and returns the area `x` and circumference `y` of the circle. The area is calculated as `r^2 * pi` and the circumference as `2 * r * pi`. The `round` function is used to round the results to 6 decimal places. The radius `r` is read from the standard input, and the results are printed to the standard output.
<|EOT|>
