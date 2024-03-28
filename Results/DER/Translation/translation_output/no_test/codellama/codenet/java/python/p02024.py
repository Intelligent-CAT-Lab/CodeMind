<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

h, w, s, t = map(int, sys.stdin.readline().split())

if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")
```
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into a list of strings, where each string represents a single number. The `int()` function is used to convert each string to an integer.</s>
