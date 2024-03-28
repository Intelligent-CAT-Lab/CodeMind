<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 0 1

```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

@@ Response
Here is the equivalent Python code:

```python
s = int(input())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, (s - 1) // a + 1)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the values as per the given formula, and prints them.<｜end▁of▁sentence｜>
