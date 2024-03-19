<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
o

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Rectangle
 */
public class p00340 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] sides = new int[4];
		int total = 0;

		for (int i = 0; i < 4; i++) {
			sides[i] = parseInt(st.nextToken());
			total += sides[i];
		}

		Arrays.sort(sides);

		if (sides[0] == sides[1] && sides[2] == sides[3]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	} // end main
}
```

### Response:
```python
import sys

def main():
    sides = list(map(int, sys.stdin.readline().split()))
    sides.sort()

    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input string to integers. The `sort()` function is used to sort the sides in ascending order. If the first two and last two elements of the sorted list are equal, it means that the rectangle is a square, so we print "yes". Otherwise, we print "no".
<|EOT|>
