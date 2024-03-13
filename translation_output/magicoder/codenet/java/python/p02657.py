<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from user
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

# printing the product of A and B
print(A*B)
```

In Python, we don't need to import any specific module for input. We can directly use the `sys.stdin.readline()` function to read input from the user. The `int()` function is used to convert the input string into an integer. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
