<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
96

```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```

### Response:
```python
import sys

n, m = map(int, sys.stdin.readline().split())

print((n-1)*(m-1))
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The result is then printed to the standard output.
<|EOT|>
