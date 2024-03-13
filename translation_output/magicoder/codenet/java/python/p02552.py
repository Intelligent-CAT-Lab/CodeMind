<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

@@ Response
```python
# Python code

# importing the built-in module for input
import sys

# reading the input
n = int(sys.stdin.readline())

# checking the condition
if n == 0:
    print("1")
else:
    print("0")
```

In Python, we don't need to import any specific module for input. We can use the built-in `sys.stdin.readline()` function to read the input. The `int()` function is used to convert the input string into an integer.<｜end▁of▁sentence｜>
