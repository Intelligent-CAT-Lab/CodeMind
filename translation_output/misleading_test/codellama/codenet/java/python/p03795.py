<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
15706

```
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class p03795{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
		n = Integer.parseInt(reader.readLine());

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}
```
[/INST]
```
import sys

n = int(sys.stdin.readline())
print((n * 800) - ((n // 15) * 200))
```
Explanation:

* `sys.stdin.readline()` reads a line of input from the standard input stream.
* `int(sys.stdin.readline())` converts the input to an integer.
* `print((n * 800) - ((n // 15) * 200))` prints the result of the calculation.

Note: The `//` operator is used for integer division in Python, which returns the integer part of the result.</s>
