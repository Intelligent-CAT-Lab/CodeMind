<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

def main():
    r = float(input())
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    print("%.6f %.6f" % (x, y))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a double value from the standard input, calculates the area and circumference of a circle with that radius, and then prints those values with 6 decimal places of precision.<｜end▁of▁sentence｜>
