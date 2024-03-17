<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a % b)

if __name__ == "__main__":
    main()
```
This code reads two integers from standard input using the `sys.stdin.readline()` method, splits them using the `split()` method, and then converts them to integers using the `map()` function. It then calculates the remainder of the two integers using the `%` operator and prints the result to standard output using the `print()` function.

Note that this code assumes that the input will be in the format of two integers separated by a space. If the input format is different, you may need to modify the code accordingly.</s>
