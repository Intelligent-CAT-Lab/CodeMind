<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
Alice


```
import java.util.*;
import java.io.*;

public class p03463 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}
```

@@ Response
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    k = b - a
    if k % 2 == 1:
        print("Borys")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input (console). The `map()` function is used to convert the input string into integers. The `if` statement checks if the difference between `b` and `a` is odd or even. If it's odd, it prints "Borys". If it's even, it prints "Alice".<｜end▁of▁sentence｜>
