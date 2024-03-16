<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:



import java.math.BigInteger;
import java.util.Scanner;

public class p02473 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		a = a.subtract(b);
		
		System.out.println(a);
	}

}



Translate the above java code to python.

python code:

[/INST]
```
import math

a = input("Enter the first number: ")
b = input("Enter the second number: ")

a = int(a) - int(b)

print(a)
```
This is a simple program that takes two numbers as input from the user, subtracts them, and prints the result.

In Python, we can use the `input()` function to get input from the user, and the `int()` function to convert the input to an integer.

The `math` module is not needed in this program, as we are not using any mathematical functions.

Note that in Python, we use `print()` instead of `System.out.println()` to print output to the console.</s>
