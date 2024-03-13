<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```

@@ Response
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print((a + b) // 2)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read input from the standard input (console). The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
