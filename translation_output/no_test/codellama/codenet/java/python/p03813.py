<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()

if int(s) < 1200:
    print("ABC")
else:
    print("ARC")
```
In this code, we first read a line of input from the standard input using `sys.stdin.readline()`. We then strip the newline character from the end of the line using the `strip()` method.

Next, we convert the input string to an integer using the `int()` function. We then compare the integer to 1200 using the `<` operator. If the integer is less than 1200, we print "ABC" to the console. Otherwise, we print "ARC".

Note that in Python, we use the `print()` function to print output to the console, rather than the `System.out.println()` method used in Java.</s>
