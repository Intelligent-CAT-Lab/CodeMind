<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```
import sys
import math

def main():
    while True:
        try:
            a, b = map(int, input().split())
            print(a % b)
        except EOFError:
            break

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `Scanner` class in Java is replaced by the `input()` function in Python, which reads a line of input from the user and returns it as a string. The `BigInteger` class in Java is not needed in Python, as Python has built-in support for large integers. The `remainder()` method in Java is replaced by the `%` operator in Python, which performs the same operation. The `while` loop in Java is replaced by a `while True` loop in Python, which continues until the user enters a blank line. The `EOFError` exception in Java is not needed in Python, as the `input()` function will automatically raise an `EOFError` when the user enters a blank line.</s>
