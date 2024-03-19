<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

def execute(n):
    r = math.isqrt(n)
    print(r * r)

if __name__ == "__main__":
    n = int(input())
    execute(n)
```

In the Python code, we use the `math.isqrt()` function to get the integer square root of the input number. The `math.isqrt()` function is available from Python 3.8. If you are using an older version of Python, you can use `int(math.sqrt(n))` instead. The `execute()` function is then called with the input number as the argument. The result is printed to the console.<｜end▁of▁sentence｜>
