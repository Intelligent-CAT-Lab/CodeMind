<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()
leng = len(s)
print(s[0], end='')
print(leng-2, end='')
print(s[-1])
```
In this code, we first read a line from the standard input using `sys.stdin.readline()`. We then strip the newline character from the end of the string using `strip()`.

Next, we calculate the length of the string using `len()`. We then print the first character of the string using `print(s[0], end='')`. The `end=''` parameter tells Python to not print a newline character after the first character.

We then print the length of the string minus 2 using `print(leng-2, end='')`. Again, the `end=''` parameter tells Python to not print a newline character after the length.

Finally, we print the last character of the string using `print(s[-1])`. The `-1` index tells Python to print the last character of the string.

Note that in Python, we use square brackets `[]` to access elements of a string, rather than parentheses `()` as in Java.</s>
