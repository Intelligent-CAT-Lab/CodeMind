<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03573 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A == B ) {
			System.out.println(C);
		} else if(B == C) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}


	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

A, B, C = map(int, sys.stdin.readline().split())

if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)
```
Note: The `map` function is used to convert the input from strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into a list of strings.</s>
