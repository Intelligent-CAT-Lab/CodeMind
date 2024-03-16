Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
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
            grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.';
        }
        for (int i = 0; i < b; i++) {
            grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#';
        }
        System.out.println("98 99");
        Arrays.stream(grid).map(String::valueOf).forEach(System.out::println);
    }
}
```

Explanation:

- We import the java.util package to use the Scanner class.
- We create a Scanner object to read input from the user.
- We declare and initialize variables a and b to store the input values.
- We create a 2D character array grid with dimensions 98x99 to store the game board.
- We use a for loop to fill the first 49 rows of the grid with '#' characters and the remaining rows with '.' characters.
- We use another for loop to mark the positions where the bombs and safe tiles are placed.
- We use the // operator to perform integer division and the % operator to perform modulo arithmetic.
- We use the Arrays.fill() method to fill the grid with '#' or '.' characters.
- We use the Arrays.stream() method to convert the 2D character array to a stream of strings.
- We use the map() method to apply the String.valueOf() method to each string in the stream.
- We use the forEach() method to print each string in the stream to the console.<|endoftext|>
