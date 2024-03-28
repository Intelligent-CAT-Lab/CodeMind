<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.*;
import java.util.*;
public class p02475
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger a=scan.nextBigInteger();
		BigInteger b=scan.nextBigInteger();
		System.out.println(a.divide(b));
	}
}



Translate the above java code to python.

python code:

[/INST]
```python
import math
import sys

a, b = map(int, sys.stdin.readline().split())
print(a // b)
```
This code first reads two integers `a` and `b` from the standard input using the `readline()` method and the `split()` method. It then uses the `//` operator to perform integer division and print the result.

Note that the `//` operator is used instead of the `/` operator because the `//` operator performs integer division, which rounds the result towards zero, while the `/` operator performs floating-point division and returns a floating-point number.</s>
