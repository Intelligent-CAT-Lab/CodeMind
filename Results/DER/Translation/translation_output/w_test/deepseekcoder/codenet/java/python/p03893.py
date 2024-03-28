<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

### Response:
```python
import sys

def calculate(x):
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    return next

x = int(sys.stdin.readline().strip())
print(calculate(x))
```

In this Python code, we define a function `calculate()` that takes an integer `x` as input and calculates the result as per the given Java code. We then read the input from `sys.stdin`, call the `calculate()` function with the input, and print the result.
<|EOT|>
