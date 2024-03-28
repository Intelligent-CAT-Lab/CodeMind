<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())
print(c, a, b)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, separated by spaces.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print(c, a, b)` prints the values of `c`, `a`, and `b` in the desired order.</s>
