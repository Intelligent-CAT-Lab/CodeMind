<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    x = int(sys.stdin.readline())
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    print(next)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then calculates the next number in the sequence by repeatedly doubling the current number and incrementing it by one. The result is then printed to the standard output.<｜end▁of▁sentence｜>
