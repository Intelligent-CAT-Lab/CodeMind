<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n, m = map(int, sys.stdin.readline().split())
print((n-1)*(m-1))
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using whitespace as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print((n-1)*(m-1))` prints the result of the multiplication.</s>
