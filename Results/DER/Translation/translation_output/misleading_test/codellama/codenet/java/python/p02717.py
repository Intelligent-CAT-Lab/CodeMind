<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
93 98 77

```
import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}

```
[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())
print(c, a, b)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, where each string is a number.
* `map(int, ...)` applies the `int()` function to each string in the list, which converts it to an integer.
* `print(c, a, b)` prints the integers `c`, `a`, and `b` in the order they were entered.

Note: The `sys` module is used to access the standard input and output streams. The `map()` function is used to apply a function to each element in an iterable.</s>
