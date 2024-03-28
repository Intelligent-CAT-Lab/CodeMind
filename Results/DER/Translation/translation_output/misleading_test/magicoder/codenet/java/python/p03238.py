<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Hell WoMrld

```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    if n == 1:
        print("Hello World")
    else:
        a, b = map(int, sys.stdin.readline().split())
        print(a + b)

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline()` to read input from the standard input (console). The `int(sys.stdin.readline())` line reads an integer from the input. The `map(int, sys.stdin.readline().split())` line reads two integers separated by spaces from the input. The `print(a + b)` line prints the sum of the two integers.<｜end▁of▁sentence｜>
