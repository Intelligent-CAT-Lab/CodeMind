Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
12.566371 12.566371


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

def calculate_area(radius):
    pi = math.pi
    x = radius**2 * pi
    y = 2 * radius * pi
    return x, y

n = int(input())
for i in range(n):
    radius = float(input())
    x, y = calculate_area(radius)
    print("{:.6f} {:.6f}".format(x, y))
```

Explanation:

- We first import the `math` module to use the value of pi.
- We define a function `calculate_area` that takes a radius as input and returns the area of the circle using the formula `x = r^2 * pi` and `y = 2 * r * pi`.
- We read the number of test cases `n` from the user.
- We loop through each test case and read the radius `radius` from the user.
- We call the `calculate_area` function with the radius as input and store the values of `x` and `y` in variables `x` and `y` respectively.
- We use the `format` method to print the values of `x` and `y` with 6 decimal places.<|endoftext|>
