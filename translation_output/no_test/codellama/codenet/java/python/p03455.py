<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

X, Y = map(int, sys.stdin.readline().split())

if X % 2 == 0 or Y % 2 == 0:
    print("Even")
else:
    print("Odd")
```
Note: The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into two parts, which are then converted to integers using the `map` function.</s>
