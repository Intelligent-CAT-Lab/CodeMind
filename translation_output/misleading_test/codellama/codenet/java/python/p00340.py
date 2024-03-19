<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    sides = list(map(int, sys.stdin.readline().split()))
    total = sum(sides)
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin, and the `map` function is used to convert the input string to a list of integers. The `sum` function is used to calculate the total of the sides, and the `sort` function is used to sort the list of sides in ascending order. The `if` statement is used to check if the first two sides are equal to the last two sides, and if so, print "yes", otherwise print "no".</s>
