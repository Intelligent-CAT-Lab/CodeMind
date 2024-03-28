<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
no


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

def is_rectangle(sides):
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        return "yes"
    else:
        return "no"

if __name__ == "__main__":
    sides = list(map(int, sys.stdin.readline().split()))
    print(is_rectangle(sides))
```

In this Python code, we first import the `sys` module to read from standard input. Then we define a function `is_rectangle` that takes a list of four integers as input. Inside the function, we sort the list and check if the first two elements are equal and the last two elements are equal. If they are, we return "yes"; otherwise, we return "no". Finally, we read a line from standard input, split it into a list of integers, and call `is_rectangle` with this list as the argument. The result is printed to standard output.
<|EOT|>
