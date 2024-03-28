<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

A, B, C = map(int, sys.stdin.readline().split())

if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes")
```
Note: The `map` function is used to convert the input from the user to integers. The `sys.stdin.readline()` function is used to read a line of input from the user, and the `split()` function is used to split the input into a list of integers.</s>
