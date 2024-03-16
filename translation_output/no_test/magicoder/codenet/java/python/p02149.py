<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    max_val = 0
    idx = 0
    for i in range(3):
        x = int(sys.stdin.readline())
        if max_val < x:
            max_val = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the maximum one and its index, and then prints the corresponding character. The `sys.stdin.readline()` function is used to read a line from the standard input, and `int()` is used to convert this line to an integer. The `chr()` function is used to convert an integer to a character, and `ord()` is used to convert a character to an integer.<｜end▁of▁sentence｜>
