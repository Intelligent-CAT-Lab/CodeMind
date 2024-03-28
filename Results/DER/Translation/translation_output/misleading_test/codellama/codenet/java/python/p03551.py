<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3882

```
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

```
[/INST]
```
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
```

The above code is a Java program that takes two integers as input and calculates the result of the expression `n*100+m*1800` and then shifts the result to the left by `m` bits.

To translate this code to Python, we can use the `int` and `long` data types in Python to represent the integers, and the `<<` operator to perform the bitwise left shift.

Here's an example of how the code could be translated to Python:
```
import sys

n, m = map(int, sys.stdin.readline().split())

base = n*100+m*1800

print(base << m)
```
This code reads two integers from standard input using the `sys.stdin.readline()` method, and then calculates the result of the expression `n*100+m*1800` and shifts the result to the left by `m` bits using the `<<` operator. The result is then printed to standard output using the `print()` function.

Note that in Python, the `<<` operator is used for bitwise left shift, while in Java, it is used for bitwise left shift and assignment. In Python, the `<<` operator is used for both bitwise left shift and assignment, so we don't need to use the `=` operator to assign the result of the bitwise left shift to a variable.</s>
