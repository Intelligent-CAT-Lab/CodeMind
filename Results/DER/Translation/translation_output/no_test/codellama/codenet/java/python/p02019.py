<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02019 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    System.out.println(n - a - b + c);
	}
}



Translate the above java code to python.

python code:

[/INST]
```
import sys

n, a, b, c = map(int, sys.stdin.readline().split())
print(n - a - b + c)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, which converts each element to an integer.
* `n, a, b, c = ...` unpacks the list of integers into separate variables `n`, `a`, `b`, and `c`.
* `print(n - a - b + c)` prints the result of the expression `n - a - b + c`.</s>
