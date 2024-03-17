<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
print(max(a * b, a, b))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, where each string is a number.
* `map(int, ...)` converts each string to an integer.
* `a * b` calculates the product of the two numbers.
* `max(a * b, a, b)` finds the maximum of the product, `a`, and `b`.
* `print()` prints the result to the standard output.</s>
