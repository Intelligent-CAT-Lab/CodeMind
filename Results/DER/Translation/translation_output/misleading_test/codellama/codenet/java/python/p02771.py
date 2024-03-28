<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Yes9

```

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

```
[/INST]
```
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    if (A == B and B == C) or (A != B and A != C and B != C):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* The rest of the code is the same as the Java code, with the exception of the `print()` function, which is used instead of `System.out.println()` in Python.

Note: The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed when the script is run directly, rather than when it is imported as a module.</s>
