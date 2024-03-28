<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
 j[*G

```
import java.util.*;
import java.io.*;

public class p03463 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}
```
[/INST]
```
import sys

n, a, b = map(int, sys.stdin.readline().split())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `readline` method is used to read a line of input from the standard input stream.</s>
