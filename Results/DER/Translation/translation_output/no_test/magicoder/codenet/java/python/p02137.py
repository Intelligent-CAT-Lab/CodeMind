<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    p = int(sys.stdin.readline())
    print(p // 500 * 500)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, divides it by 500, multiplies the result by 500, and then prints the result.<｜end▁of▁sentence｜>
