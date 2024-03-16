Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class Rectangle:
    def __init__(self, sides):
        self.sides = sides

    def is_square(self):
        sides = sorted(self.sides)
        return sides[0] == sides[1] and sides[2] == sides[3]

def main():
    input_stream = sys.stdin
    sides = list(map(int, input_stream.readline().strip().split()))
    rectangle = Rectangle(sides)
    if rectangle.is_square():
        print("yes")
    else:
        print("no")

if __name__ == '__main__':
    main()
```<|endoftext|>
