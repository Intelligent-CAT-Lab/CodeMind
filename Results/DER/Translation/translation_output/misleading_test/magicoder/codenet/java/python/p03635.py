<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# Python code

# Read input from user
n, m = map(int, input().split())

# Calculate and print the result
print((n-1)*(m-1))
```

Test input:
3 4

Expected output:
96<｜end▁of▁sentence｜>
