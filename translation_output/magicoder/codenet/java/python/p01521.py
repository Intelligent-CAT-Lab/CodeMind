<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}
```

@@ Response
Here is the equivalent Python code:

```python
c = input()
if c[0] == 'x' and c[-1] == 'x':
    print('x')
else:
    print('o')
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the first and last characters are 'x', and prints 'x' if they are, otherwise it prints 'o'.<｜end▁of▁sentence｜>
