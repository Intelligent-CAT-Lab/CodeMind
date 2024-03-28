<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(input())
m = int(input())

base = n * 100 + m * 1800

print(base << m)
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is not needed in Python, as the `input()` function can be used to read input from the user. The `<<` operator in Java is equivalent to the `<<` operator in Python, which is used for bitwise left shift. The `print()` function in Python is used to print the result to the console.</s>
