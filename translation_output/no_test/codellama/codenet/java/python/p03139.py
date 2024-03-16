<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import math

N = int(input())
A = int(input())
B = int(input())
print(math.min(A, B), math.max(0, A + B - N))
```
This is the equivalent Python code for the given Java code. The `math.min()` and `math.max()` functions are used to find the minimum and maximum values of the two input numbers, respectively. The `input()` function is used to read the input from the user. The `print()` function is used to print the output.</s>
