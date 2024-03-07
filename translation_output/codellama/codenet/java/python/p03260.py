<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

n, k = map(int, sys.stdin.readline().split())

if (n * k) % 2 == 1:
    print("Yes")
else:
    print("No")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `(n * k) % 2 == 1` checks if the product of `n` and `k` is odd.
* `print("Yes")` or `print("No")` prints the corresponding message.</s>
