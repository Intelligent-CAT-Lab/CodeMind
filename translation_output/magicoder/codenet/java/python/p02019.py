<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02019 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    System.out.println(n - a - b + c);
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    print(n - a - b + c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input (sys.stdin), subtracts `a`, `b`, and adds `c` to the total, and then prints the result.<｜end▁of▁sentence｜>
