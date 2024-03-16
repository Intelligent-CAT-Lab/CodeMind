<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```

@@ Response
```python
import sys

def main():
    T = int(sys.stdin.readline())
    X = int(sys.stdin.readline())
    a = T / X
    print(a)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import the `Scanner` class from `java.util`. Instead, we use the `sys.stdin.readline()` function to read input from the standard input (console). The `int()` function is used to convert the input string to an integer. The `/` operator performs division in Python, and the `print()` function is used to output the result.<｜end▁of▁sentence｜>
