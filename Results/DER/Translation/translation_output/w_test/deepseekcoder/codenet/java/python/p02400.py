<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

def main():
    r = float(input())
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    print("{:.6f} {:.6f}".format(x, y))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to read the radius from the standard input. The `float()` function is used to convert the input string to a floating-point number. The `math.pi` constant is used to get the value of pi. The area and circumference of the circle are then calculated and printed with 6 decimal places using the `"{:.6f}".format()` format string.
<|EOT|>
