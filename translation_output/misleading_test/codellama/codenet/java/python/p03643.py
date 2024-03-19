<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
AC100

```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```
[/INST]
```python
import sys

with open(sys.argv[1], 'r') as f:
    a = int(f.read())

print("ABC" + str(a))
```
This code reads the input from the file specified in the command line argument, converts it to an integer using the `int()` function, and then prints the result to the console.

The `with` statement is used to open the file and ensure that it is properly closed when the code is finished with it. The `open()` function is used to open the file, and the `read()` method is used to read the contents of the file as a string. The `int()` function is then used to convert the string to an integer. Finally, the `print()` function is used to print the result to the console.</s>
