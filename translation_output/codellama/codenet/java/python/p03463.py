<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

n, a, b = map(int, sys.stdin.readline().split())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")
```
Note: The `map` function is used to convert the input from a string to an integer. The `split` function is used to split the input into a list of integers. The `readline` function is used to read a line of input from the standard input stream.</s>
