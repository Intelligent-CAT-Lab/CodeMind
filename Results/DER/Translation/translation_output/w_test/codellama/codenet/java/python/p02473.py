<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-3


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
This code uses the `input()` function to read a line of input from the user, and then uses the `split()` method to split the input into two numbers. The `map()` function is used to convert the two numbers to integers. Finally, the difference between the two numbers is calculated and printed to the console using the `print()` function.

Here's an example of how the code would work:
```
$ python3 solution.py
5 8
-3
```
In this example, the user enters the numbers `5` and `8` separated by a space, and the code prints the difference between the two numbers, which is `-3`.</s>
