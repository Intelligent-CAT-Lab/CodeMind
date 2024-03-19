<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
96

```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```
[/INST]
```
import sys

n, m = map(int, sys.stdin.readline().split())
print((n-1)*(m-1))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, which converts each element to an integer.
* `n` and `m` are assigned the first and second elements of the list, respectively.
* `print((n-1)*(m-1))` prints the result of the multiplication of `n-1` and `m-1`.</s>
