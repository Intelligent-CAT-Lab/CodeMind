<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```

@@ Response
```python
a = int(input())
print("ABC" + str(a))
```

In Python, we don't need to import any libraries or use try-catch blocks. We can directly use the `input()` function to get user input and the `print()` function to output. The `str()` function is used to convert integers to strings, as `print()` can only concatenate strings.<｜end▁of▁sentence｜>
