<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```

@@ Response
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    print((n-1)*(m-1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the product of `(n-1)` and `(m-1)`, and then prints the result.<｜end▁of▁sentence｜>
