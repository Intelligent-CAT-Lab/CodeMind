<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
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

```

@@ Response
```python
import sys

def main():
    K = int(sys.stdin.readline())
    X = int(sys.stdin.readline())

    for i in range(X - K + 1, X + K):
        if i != X + K - 1:
            print(i, end=' ')
        else:
            print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, K and X, and then prints all integers in the range from X - K + 1 to X + K - 1, separated by spaces. The last integer is followed by a newline.<｜end▁of▁sentence｜>
