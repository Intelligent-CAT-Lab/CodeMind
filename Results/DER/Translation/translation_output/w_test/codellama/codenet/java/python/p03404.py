<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3 3
##.
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
This is the Python code that translates the given Java code. The code first reads the input from the standard input and splits it into two integers `a` and `b`. It then initializes a 2D list `grid` with 98 rows and 99 columns, where each element is initialized to `'#'` if the row index is less than 49, and to `'.'` otherwise.

Next, the code iterates over the rows of `grid` and sets the element at the index `i // 49 * 2 + 1` and `i % 49 * 2 + 1` to `'.'` for each row `i` in the range `0` to `a - 1`. This is equivalent to the Java code `grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.';` for each row `i` in the range `0` to `a - 1`.

After that, the code iterates over the rows of `grid` and sets the element at the index `i // 49 * 2 + 50` and `i % 49 * 2 + 1` to `'#'` for each row `i` in the range `0` to `b - 1`. This is equivalent to the Java code `grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#';` for each row `i` in the range `0` to `b - 1`.

Finally, the code prints the size of the grid and the contents of the grid to the standard output. The size of the grid is printed as "98 99", and the contents of the grid are printed as a series of rows, each row consisting of 99 characters. The characters in each row are separated by a space.</s>
