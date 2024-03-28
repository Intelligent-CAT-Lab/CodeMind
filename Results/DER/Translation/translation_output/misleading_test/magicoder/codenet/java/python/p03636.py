<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
.18n

```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

@@ Response
Here is the Python equivalent of the given Java code:

```python
s = input()
leng = len(s)
print(s[0] + str(leng-2) + s[leng-1])
```

This Python code does the same thing as the Java code. It reads a string from the user, calculates the length of the string, and then prints the first character, the length of the string minus 2, and the last character of the string.<｜end▁of▁sentence｜>
