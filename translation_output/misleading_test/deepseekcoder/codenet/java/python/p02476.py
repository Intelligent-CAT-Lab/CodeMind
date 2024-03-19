<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys
import math

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a % b)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import `BigInteger` or use `BufferedInputStream`. Instead, we can use the built-in `map` function to read the input and the `%` operator to find the remainder. The `sys.stdin.readline().split()` function is used to read the input from the standard input.
<|EOT|>
