Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class p02400:
    def main(self):
        r = float(input())
        pi = math.pi
        x = r*r*pi
        y = 2*r*pi
        print("{:.6f} {:.6f}".format(x,y))

p02400().main()
```

Explanation:

- We first import the `math` module to use the value of pi.
- We define a class `p02400` which has a method `main` which takes no arguments.
- Inside the `main` method, we take the input radius `r` from the user using the `input` function and convert it to a float.
- We calculate the value of pi using the `math.pi` constant.
- We calculate the value of `x` and `y` using the formulae given in the problem statement.
- We use the `print` function to display the values of `x` and `y` with 6 decimal places using the `format` method.<|endoftext|>
