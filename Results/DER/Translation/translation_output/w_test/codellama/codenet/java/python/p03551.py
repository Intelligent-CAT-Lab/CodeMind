<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


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

In Python, the equivalent code would be:
```
import sys

n, m = map(int, sys.stdin.readline().split())

base = n * 100 + m * 1800

print(base << m)
```
This code reads the input from stdin, splits it into two integers `n` and `m`, calculates the base value using the formula `n * 100 + m * 1800`, and then prints the result of shifting the base value left by `m` bits using the `<<` operator.

Note that the `<<` operator in Python is used to shift the bits of an integer to the left, while the `<<` operator in Java is used to shift the bits of a long integer to the left. In Python, the `<<` operator is overloaded to work with integers and long integers, while in Java, it is only defined for long integers.</s>
