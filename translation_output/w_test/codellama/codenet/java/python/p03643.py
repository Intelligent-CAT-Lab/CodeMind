<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```
[/INST]
```
import sys

def main():
    a = int(input())
    print("ABC" + str(a))

if __name__ == "__main__":
    main()
```

Explanation:

* The `import sys` statement is used to import the `sys` module, which provides access to the system's functions and variables.
* The `def main()` function is the entry point of the program, and it is called when the program is executed.
* The `a = int(input())` statement reads an integer from the standard input and assigns it to the variable `a`.
* The `print("ABC" + str(a))` statement prints the string "ABC" followed by the value of `a` converted to a string.
* The `if __name__ == "__main__":` statement is used to indicate that the `main()` function should be executed when the program is run directly, rather than when it is imported as a module.

Note: The `try` statement is not necessary in Python, as it is not used to handle exceptions in the same way as in Java.</s>
