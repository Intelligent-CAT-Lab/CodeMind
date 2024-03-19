<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
21

Expected output:
-27

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
[/INST]
```python
import sys

def main():
    M = int(sys.stdin.readline())
    result = (24 - M) + 24
    print(result)

if __name__ == "__main__":
    main()
```
This code reads an integer `M` from standard input, calculates the result as `(24 - M) + 24`, and prints the result to standard output.

Note that the `InputStreamReader` and `BufferedReader` classes are not necessary in Python, as the `sys.stdin` object can be used to read from standard input directly. The `StandardCharsets.UTF_8` class is also not necessary, as Python uses UTF-8 encoding by default.</s>
