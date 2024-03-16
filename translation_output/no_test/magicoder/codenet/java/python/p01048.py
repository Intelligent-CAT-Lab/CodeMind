<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
    i = int(sys.stdin.readline())

    print(ans[i])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints the corresponding element from the list `ans`.<｜end▁of▁sentence｜>
