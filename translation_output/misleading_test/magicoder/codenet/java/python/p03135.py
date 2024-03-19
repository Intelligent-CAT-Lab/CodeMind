<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3

Expected output:
101.86360202326958

```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```

@@ Response
```python
# Python code

# Get input from user
T, X = map(int, input().split())

# Calculate the result
a = T / X

# Print the result
print(a)
```

Test input:
8 3

Expected output:
2.6666666666666665<｜end▁of▁sentence｜>
