<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 2 3

Expected output:
Yes


```
import java.util.*;

public class p02024 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s = sc.nextInt();
		long t = sc.nextInt();
		if (h * w % 2 == 1 && (s * w + t) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```
[/INST]
```
import sys

h, w, s, t = map(int, sys.stdin.readline().split())

if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `h * w % 2 == 1` checks if the product of `h` and `w` is odd.
* `(s * w + t) % 2 == 1` checks if the sum of `s * w` and `t` is odd.
* If both conditions are true, the program prints "No", otherwise it prints "Yes".</s>
