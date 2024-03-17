<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8 9


```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```
[/INST]
```python
import sys

K, X = map(int, sys.stdin.readline().split())

for i in range(X - K + 1, X + K):
    print(i, end=" ")
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `range(X - K + 1, X + K)` generates a range of integers from `X - K + 1` to `X + K - 1`.
* `print(i, end=" ")` prints each integer in the range, followed by a space. The `end=" "` parameter specifies that the space should be printed at the end of the line, rather than at the beginning.
* The `for` loop iterates over the range of integers and prints each one.

Note: The `print()` function in Python 3.x is different from the `print()` function in Python 2.x. In Python 3.x, `print()` is a function that returns `None`, whereas in Python 2.x, `print()` is a statement that prints to the console. In this solution, we use the `print()` function in Python 3.x, which returns `None`.</s>
