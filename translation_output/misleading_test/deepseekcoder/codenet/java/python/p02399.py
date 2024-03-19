<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1

```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```

### Response:
```python
a, b = map(int, input().split())

d = a//b
r = a%b
f = "{:.5f}".format(a/b)

print(d, r, f)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the quotient and remainder of the division, and the floating point division, and then prints them. The format specifier "{:.5f}" is used to format the floating point number to 5 decimal places.
<|EOT|>
