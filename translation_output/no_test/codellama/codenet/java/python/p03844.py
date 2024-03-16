<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		int c = 0;
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		if(s.equals("+")) {
			c = a + b;
		}else if(s.equals("-")) {
			c = a - b;
		}
		System.out.print(c);
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, s, b = map(int, input().split())

if s == "+":
    c = a + b
elif s == "-":
    c = a - b

print(c)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `split` function is used to split the input into three parts. The `if` statement is used to check the value of `s` and perform the appropriate operation. Finally, the result is printed to the console using the `print` function.</s>
