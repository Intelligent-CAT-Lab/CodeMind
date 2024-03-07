<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())
print(A * B)
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `map(int, sys.stdin.readline().split())` is used to read a line from the standard input and split it into two integers. The `map()` function is used to convert the strings to integers.
* `print(A * B)` is used to print the product of the two integers.

Note: The `sys.stdin.readline()` method is used to read a line from the standard input. The `split()` method is used to split the line into two integers. The `map()` function is used to convert the strings to integers.</s>
