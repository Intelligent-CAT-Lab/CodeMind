<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5700

Expected output:
5505

```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
p = int(input())
print(p // 500 * 500)
```

This Python code does the same thing as the Java code. It reads an integer from the user, divides it by 500, rounds down to the nearest whole number, and then multiplies that result by 500. The `//` operator in Python is used for integer division, which rounds down to the nearest whole number.<｜end▁of▁sentence｜>
