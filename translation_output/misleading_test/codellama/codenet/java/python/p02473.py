<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-31

```


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


```
[/INST]
```
import math

a, b = map(int, input().split())

print(a - b)
```
This code uses the `input()` function to read a line of input from the user, and then uses the `split()` method to split the input into two numbers. The `map()` function is used to convert the two numbers to integers. Finally, the `print()` function is used to print the result of the subtraction.

Note that this code assumes that the input will be two numbers separated by a space. If the input is not in this format, the code will not work correctly.</s>
