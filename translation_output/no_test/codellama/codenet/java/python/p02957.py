<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		long k = a + b;
		if (k % 2 == 0)
			System.out.println(k / 2);
		else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())
k = a + b
if k % 2 == 0:
    print(k // 2)
else:
    print("IMPOSSIBLE")
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `//` operator is used to perform integer division and print the result. The `if` statement is used to check if the sum of `a` and `b` is even, and if it is, the result is printed. If the sum is odd, the string "IMPOSSIBLE" is printed instead.</s>
