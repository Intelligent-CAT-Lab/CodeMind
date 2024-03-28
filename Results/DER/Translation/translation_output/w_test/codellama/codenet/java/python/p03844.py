<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
3


```
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
```
[/INST]
```
import sys

a = int(input())
s = input()
b = int(input())

if s == "+":
    c = a + b
elif s == "-":
    c = a - b

print(c)
```
This code uses the `input()` function to read the input from the user, and then uses the `if` statement to check if the input is equal to "+" or "-". If it is, it calculates the result using the appropriate operation, and then prints the result using the `print()` function.

Note that in Python, the `input()` function returns a string, so we need to convert it to an integer using the `int()` function before we can use it in the calculation.</s>
