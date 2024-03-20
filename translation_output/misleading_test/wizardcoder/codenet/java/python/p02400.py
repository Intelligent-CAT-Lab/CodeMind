Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def calculate_area(r):
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    return x, y

n = int(input())
for i in range(n):
    r = float(input())
    x, y = calculate_area(r)
    print("{:.6f} {:.6f}".format(x, y))
```

Explanation:

- We first import the `math` module to use the value of pi.
- We define a function `calculate_area` that takes in a radius `r` and returns the area of the circle with that radius.
- We read the input from the user using `input()` function and convert it to an integer using `int()` function.
- We use a for loop to iterate `n` times, where `n` is the input integer.
- Inside the loop, we read the radius `r` from the user using `input()` function and convert it to a float using `float()` function.
- We call the `calculate_area` function with the radius `r` and store the returned values of `x` and `y` in variables `x` and `y` respectively.
- We use the `format()` function to print the values of `x` and `y` with 6 decimal places.<|endoftext|>
