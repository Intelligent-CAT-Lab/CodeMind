<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even

```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```
[/INST]
```
import sys

X, Y = map(int, sys.stdin.readline().split())

if X % 2 == 0 or Y % 2 == 0:
    print("Even")
else:
    print("Odd")
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `X, Y = map(int, sys.stdin.readline().split())` is used to read a line of input from the standard input stream and split it into two integers. The `map()` function is used to convert the strings to integers.
* `if X % 2 == 0 or Y % 2 == 0:` is used to check if either `X` or `Y` is even. If either one is even, the condition is true and the code inside the `if` block is executed.
* `print("Even")` is used to print the string "Even" to the standard output stream.
* `else:` is used to indicate the code that should be executed if the condition is false.
* `print("Odd")` is used to print the string "Odd" to the standard output stream.</s>
