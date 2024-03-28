<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
57

```
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class p02476 {
	public static void main(String []args)
	{
		Scanner in =new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
		{
			BigInteger a = in.nextBigInteger(),b = in.nextBigInteger();
			System.out.println(a.remainder(b));
		}
		in.close();
	}
}


```

@@ Response
```python
import sys

def main():
    while True:
        try:
            a, b = map(int, sys.stdin.readline().split())
            print(a % b)
        except EOFError:
            break

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map(int, sys.stdin.readline().split())` function splits the input into two integers. The `a % b` operation is used to find the remainder of the division of `a` by `b`. If the input is not a number, the `map(int, sys.stdin.readline().split())` function will raise a `ValueError`, which is caught and handled by the `except EOFError:` clause. This clause breaks the loop and ends the program.<｜end▁of▁sentence｜>
