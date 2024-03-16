<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
 
public class p03404 {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[]$) {
		int a = scanner.nextInt() - 1;
		int b = scanner.nextInt() - 1;
		char[][] grid = new char[98][99];
		for (int i = 0; i < 98; i++) {
			if (i < 49) {
				Arrays.fill(grid[i], '#');
			} else {
				Arrays.fill(grid[i], '.');
			}
		}
		for (int i = 0; i < a; i++) {
			grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.';
		}
		for (int i = 0; i < b; i++) {
			grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#';
		}
		System.out.println("98 99");
		Arrays.stream(grid).map(String::valueOf).forEach(System.out::println);
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
grid = [['#' for _ in range(99)] for _ in range(98)]
for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
print('98 99')
for row in grid:
    print(''.join(row))
```
This code first reads the input from the standard input stream using `sys.stdin.readline()`. It then splits the input into two integers `a` and `b` using the `split()` method.

Next, it initializes a 2D list `grid` with 98 rows and 99 columns, where each element is initialized to `'#'`.

It then iterates over the range of `a` and sets the element at the corresponding row and column to `'.'`.

Similarly, it iterates over the range of `b` and sets the element at the corresponding row and column to `'#'`.

Finally, it prints the 2D list `grid` to the standard output stream using a for loop and the `join()` method.</s>
