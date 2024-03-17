<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


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
import sys

a, b = map(int, sys.stdin.readline().split())

d = a//b
r = a%b
f = "{:.5f}".format(a / b)

print(d, r, f)
```

In Python, we don't need to close the scanner like in Java. We can use `sys.stdin.readline()` to read the input. The `map()` function is used to convert the input into integers. The `//` operator is used for integer division and the `%` operator is used for modulus operation. The `"{:.5f}".format()` is used to format the float value to 5 decimal places.
<|EOT|>
