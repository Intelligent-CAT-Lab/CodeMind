<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import math

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a % b)
```

This Python code reads from the standard input (stdin), splits each line into two integers, and then prints the remainder of the first integer divided by the second. It does this for each line of input until it reaches the end of the input.<｜end▁of▁sentence｜>
