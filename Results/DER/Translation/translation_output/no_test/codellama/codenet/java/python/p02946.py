<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

K, X = map(int, sys.stdin.readline().split())

for i in range(X - K + 1, X + K):
    if i != X + K - 1:
        print(i, end=" ")
    else:
        print(i)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from the standard input stream to integers, and the `range` function is used to generate the sequence of numbers from `X - K + 1` to `X + K`. The `end` parameter of the `print` function is used to specify the separator between the numbers, which is a space in this case.</s>
