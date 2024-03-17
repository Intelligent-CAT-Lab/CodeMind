<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even


```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```

@@ Response
```python
# Python code

# Get input from user
X, Y = map(int, input().split())

# Check if either X or Y is even
if X % 2 == 0 or Y % 2 == 0:
    print("Even")
else:
    print("Odd")
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if either of them is even, and prints "Even" if it is, otherwise it prints "Odd".<｜end▁of▁sentence｜>
