<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
21

Expected output:
27


```
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class p03473 {
	static int[] MASK = { 1, 2, 4 };

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int M = Integer.parseInt(in.readLine());
		int result = (24- M) + 24;
		System.out.println(result);
	}
}

```

@@ Response
```python
import sys

def main():
    M = int(sys.stdin.readline())
    result = (24 - M) + 24
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the result, and then prints it. The `sys.stdin.readline()` function is used to read a line from the standard input, and `int()` is used to convert that line into an integer. The result is then printed using the `print()` function.<｜end▁of▁sentence｜>
