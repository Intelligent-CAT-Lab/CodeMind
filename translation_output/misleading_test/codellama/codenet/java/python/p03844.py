<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
47

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
import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        int c = 0;
        if (s.equals("+")) {
            c = a + b;
        } else if (s.equals("-")) {
            c = a - b;
        }
        System.out.print(c);
    }
}
```
This is the equivalent Python code for the given Java code. The `Scanner` class is not available in Python, so we need to use the `input()` function to read input from the user. The `String` class is not available in Python either, so we need to use the `str` type instead. The `equals()` method is not available in Python either, so we need to use the `==` operator instead.

Here's the Python code:
```
a = int(input("Enter the first number: "))
s = input("Enter the operator (+ or -): ")
b = int(input("Enter the second number: "))
c = 0
if s == "+":
    c = a + b
elif s == "-":
    c = a - b
print(c)
```
This code will prompt the user to enter two numbers and an operator (+ or -), and then it will perform the operation and print the result.</s>
