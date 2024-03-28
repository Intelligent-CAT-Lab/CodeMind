<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num*num*num);
	}

}
```
[/INST]
```
import sys

num = int(sys.stdin.readline())
print(num * num * num)
```
Explanation:

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int()` converts the input string to an integer.
* `print()` prints the result to the standard output stream.

Note: The `BufferedReader` and `InputStreamReader` classes are not necessary in Python, as the `sys.stdin` object provides a similar functionality.</s>
