<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
-7

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

In this Python code, we use the `math.isqrt(n)` function to get the integer square root of a number. This function is equivalent to `Math.sqrt(n)` in Java. The `int(input())` function is used to get the input from the user. The `execute(n)` function is equivalent to the `execute(Scanner scanner)` function in the Java code.
<|EOT|>
