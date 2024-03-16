<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(sys.stdin.readline())
print((n * 800) - ((n // 15) * 200))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `int()` converts the string to an integer.
* `print()` prints the result to the standard output.
* `//` is the integer division operator, which returns the integer part of the result.
* `*` is the multiplication operator, which returns the product of the two operands.
* `-` is the subtraction operator, which returns the difference of the two operands.

Note: The `//` operator is used instead of `/` because it returns the integer part of the result, which is what we want in this case.</s>
