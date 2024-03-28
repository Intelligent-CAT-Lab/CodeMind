<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

@@ Response
```python
import sys

def main():
    N = int(sys.stdin.readline())
    A, B = map(int, sys.stdin.readline().split())
    print(min(A, B), max(0, A + B - N))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers N, A, and B from the standard input, and then prints the minimum of A and B and the maximum of 0 and A + B - N.<｜end▁of▁sentence｜>
