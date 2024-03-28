<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:


```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

@@ Response
```python
# Python code

# Read input
numbers = list(map(int, input().split()))

# Find the maximum number and its index
max_num = max(numbers)
idx = numbers.index(max_num)

# Convert the index to a character and print it
print(chr(ord('A') + idx))
```

This Python code does the same thing as the Java code. It reads three integers from the input, finds the maximum one and its index, and then converts the index to a character and prints it. The `ord` function is used to convert a character to its ASCII value, and `chr` is used to convert an ASCII value back to a character.<｜end▁of▁sentence｜>
