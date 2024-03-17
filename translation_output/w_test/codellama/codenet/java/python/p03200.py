<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBW

Expected output:
2


```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

In this code, the `Scanner` class is used to read input from the user. The `next()` method is used to read the input as a string. The `charAt()` method is used to access the characters in the string. The `length()` method is used to get the length of the string.

Here is the equivalent Python code:
```
import sys

s = input()

count = 0
black = 0
for i in range(len(s)):
    if s[i] == 'W':
        count += black
    else:
        black += 1

print(count)
```
In this code, the `input()` function is used to read input from the user. The `len()` function is used to get the length of the string. The `range()` function is used to iterate over the characters in the string. The `+=` operator is used to increment the `count` variable.

Note that in Python, the `input()` function returns a string, so you don't need to use the `next()` method. Also, in Python, the `range()` function returns a list of integers, so you don't need to use the `charAt()` method.</s>
