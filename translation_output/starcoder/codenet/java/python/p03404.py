<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

def main():
    a = int(sys.stdin.readline()) - 1
    b = int(sys.stdin.readline()) - 1
    grid = [['#' for i in range(99)] for j in range(98)]
    for i in range(a):
        grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.'
    for i in range(b):
        grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#'
    print('98 99')
    for i in grid:
        print(''.join(i))

if __name__ == '__main__':
    main()
```
<|endoftext|>
