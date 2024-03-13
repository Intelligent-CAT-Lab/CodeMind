<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python

import sys

def main():
    a = int(sys.stdin.readline())

    print("ABC" + str(a))

if __name__ == "__main__":
    main()

```

In Python, we don't need to import the `Scanner` class from `java.util`. Instead, we use the `sys.stdin.readline()` function to read input from the standard input (console). The `int()` function is used to convert the input string to an integer. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
