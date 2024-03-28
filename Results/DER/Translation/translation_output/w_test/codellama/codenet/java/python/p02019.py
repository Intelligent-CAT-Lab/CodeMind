<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
2


```
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


```
[/INST]
```
import sys

n, a, b, c = map(int, sys.stdin.readline().split())
print(n - a - b + c)
```
This code reads a line of input from stdin, splits it into four integers using the `split()` method, and then prints the result of the calculation `n - a - b + c` to stdout.</s>
