<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

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
```python
import sys

def main():
    ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
    i = int(sys.stdin.readline())

    print(ans[i])

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `int()` function is used to convert the input string to an integer. The `print()` function is used to output the result. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.<｜end▁of▁sentence｜>
