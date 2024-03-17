<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
9


```
import java.util.Scanner;

public class p03556 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int r = (int) Math.sqrt(scanner.nextInt());
		System.out.println(r * r);
	}
}

```

### Response:
```python
import math

def execute(n):
    r = math.isqrt(n)
    print(r * r)

n = int(input())
execute(n)
```

In Python, the equivalent code is as follows. The `math.isqrt(n)` function in Python is equivalent to `(int) Math.sqrt(n)` in Java. The `print()` function in Python is equivalent to `System.out.println()` in Java. The `input()` function in Python is equivalent to `scanner.nextInt()` in Java.
<|EOT|>
