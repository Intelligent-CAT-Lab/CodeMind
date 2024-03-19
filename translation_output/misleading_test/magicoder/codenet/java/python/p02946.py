<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8

```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```

@@ Response
```python
# Python code

# Get input from user
K, X = map(int, input().split())

# Generate the sequence
sequence = [i for i in range(X - K + 1, X + K)]

# Print the sequence
print(*sequence)
```

This Python code does the same thing as the Java code. It reads two integers from the user, generates a sequence of integers from `X - K + 1` to `X + K - 1`, and then prints the sequence. The `*` operator is used to unpack the list into separate arguments for `print`.<｜end▁of▁sentence｜>
