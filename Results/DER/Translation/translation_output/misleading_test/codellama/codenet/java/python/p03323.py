<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay

```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 8 and b <= 8:
    print("Yay!")
else:
    print(":(")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if both `a` and `b` are less than or equal to 8, and prints "Yay!" if they are, and ":((" if they are not.

Note: The `sys` module is used to read from the standard input, and the `map()` function is used to apply the `int()` function to each element of the list.</s>
