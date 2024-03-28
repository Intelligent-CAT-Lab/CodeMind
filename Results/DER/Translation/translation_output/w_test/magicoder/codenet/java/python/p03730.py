<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YES


```
import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```

@@ Response
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then checks if there exists an integer `i` in the range 0 to 5000 such that `a * i` is divisible by `b` and the remainder is equal to `c`. If such an `i` exists, it prints "YES" and returns. If no such `i` exists, it prints "NO".<｜end▁of▁sentence｜>
