<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```
[/INST]
```
import java.util.Scanner;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}
```

Here is the Python code that produces the same output as the Java code:
```
import sys

x = int(sys.stdin.readline())
next = 2
for i in range(x):
    next = (next + 1) * 2
print(next)
```
Note that the Python code uses the `sys` module to read input from stdin, and the `range` function to iterate over the values of `x`. The rest of the code is similar to the Java code.</s>
