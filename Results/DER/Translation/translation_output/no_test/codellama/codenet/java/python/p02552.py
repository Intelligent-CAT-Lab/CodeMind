<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n = int(input())
if n == 0:
    print(1)
else:
    print(0)
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is replaced by the `input()` function in Python, which reads a line of input from the user and returns it as a string. The `nextInt()` method in Java is replaced by the `int()` function in Python, which converts the input string to an integer. The rest of the code is similar in both languages.</s>
