<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1

Expected output:
Y$s

```
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

```
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
* `n` and `k` are assigned the values of the first and second elements of the list, respectively.
* The rest of the code is the same as the Java code, with the exception of the `print()` function, which is used in Python to print to the console.

Note: The `sys` module is used to access the standard input and output streams in Python.</s>
