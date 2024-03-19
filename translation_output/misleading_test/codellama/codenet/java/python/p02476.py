<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a % b)

if __name__ == "__main__":
    main()
```
This code reads two integers `a` and `b` from standard input using the `sys.stdin.readline()` method, and then calculates the remainder of `a` divided by `b` using the `%` operator. The result is then printed to standard output using the `print()` function.

Note that the `map()` function is used to convert the input strings to integers. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed when the script is run as a standalone program, and not when it is imported as a module.</s>
