<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    for line in sys.stdin:
        a, b = map(int, line.split())
        print(a % b)

if __name__ == "__main__":
    main()
```

This Python code reads from standard input (stdin), splits each line into two integers, and prints the remainder of the division of the first integer by the second. It does this for each line of input until there is no more input.

Note: This Python code assumes that the input will always be two integers separated by a space. If the input format can vary, you would need to adjust the code accordingly.
<|EOT|>
