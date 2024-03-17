<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

def main():
    M = int(sys.stdin.readline())
    result = (24 - M) + 24
    print(result)

if __name__ == '__main__':
    main()
```
This is a Python implementation of the Java code provided. It uses the `sys` module to read input from stdin and the `int` function to convert the input to an integer. The rest of the code is similar to the Java code, with the exception of the `BufferedReader` and `InputStreamReader` classes, which are not needed in Python. The `print` function is used to output the result.</s>
