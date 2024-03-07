<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()
count = 0
black = 0

for i in range(len(s)):
    if s[i] == 'W':
        count += black
    else:
        black += 1

print(count)
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing whitespace from the input string. The rest of the code is similar to the Java code, with the exception of the `range()` function being used instead of the `for` loop with a condition.</s>
