<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 16

Expected output:
9


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		long k = a + b;
		if (k % 2 == 0)
			System.out.println(k / 2);
		else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}

```

@@ Response
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, adds them together, and then checks if the sum is even or odd. If it's even, it prints the sum divided by 2. If it's odd, it prints "IMPOSSIBLE".<｜end▁of▁sentence｜>
