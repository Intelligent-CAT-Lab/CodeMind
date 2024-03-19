<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
36

```
import java.util.*;

public class p02019 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    System.out.println(n - a - b + c);
	}
}


```

@@ Response
```python
# Python code

# Read input from user
n, a, b, c = map(int, input().split())

# Calculate and print the result
print(n - a - b + c)
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the result as `n - a - b + c`, and then prints the result.<｜end▁of▁sentence｜>
