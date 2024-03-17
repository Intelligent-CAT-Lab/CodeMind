<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
5


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
    for line in sys.stdin:
        a, b = map(int, line.split())
        print(a % b)

if __name__ == "__main__":
    main()
```

This Python code reads from the standard input (stdin), splits the input into two numbers, and then prints the remainder of the division of the first number by the second number. The ```math.remainder()``` function in Python does the same thing as the ```remainder()``` method in Java.
<|EOT|>
