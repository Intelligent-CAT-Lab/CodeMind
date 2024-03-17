<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
7


```
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
```
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
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The `if` statement checks if `A` is equal to `B`, and if so, prints `C`.
* The `elif` statement checks if `B` is equal to `C`, and if so, prints `A`.
* The `else` statement prints `B`.

Note that this solution assumes that the input is a single line of integers separated by spaces. If the input can have multiple lines, you will need to modify the code accordingly.</s>
