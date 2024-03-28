<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3 3
..#
#.#

```
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
```
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    grid = [['#' for _ in range(99)] for _ in range(98)]
    for i in range(98):
        if i < 49:
            grid[i][:] = ['#' for _ in range(99)]
        else:
            grid[i][:] = ['.' for _ in range(99)]
    for i in range(a):
        grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
    for i in range(b):
        grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
    print("98 99")
    for row in grid:
        print("".join(row))

if __name__ == "__main__":
    main()
```
This code reads two integers `a` and `b` from standard input, and then creates a 98x99 grid of characters. The grid is initialized with `#` for the first 49 rows and `.` for the remaining 49 rows. Then, it sets the characters in the first `a` rows and columns to `.`, and the characters in the next `b` rows and columns to `#`. Finally, it prints the grid to standard output, preceded by the string "98 99".

Note that the code uses the `map` function to convert the input strings to integers, and the `range` function to generate the indices for the grid. It also uses the `join` method to concatenate the characters in each row into a single string, and the `print` function to print the grid to standard output.</s>
