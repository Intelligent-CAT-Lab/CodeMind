<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n, k = map(int, sys.stdin.readline().split())
print(n - k + 1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using whitespace as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print()` prints the result to the standard output.</s>
