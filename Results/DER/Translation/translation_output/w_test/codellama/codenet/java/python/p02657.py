<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```
[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())
print(A * B)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print()` prints the result to the standard output.

Note: The `@SuppressWarnings("resource")` annotation is used to suppress warnings about the `Scanner` object not being closed. In Python, we don't need to close the standard input stream, so this annotation is not necessary.</s>
