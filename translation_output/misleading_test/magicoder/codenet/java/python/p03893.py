<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
67

```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    print(next)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `int()` function is used to convert the input string to an integer. The `for` loop is used to perform the same operation as in the Java code. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
