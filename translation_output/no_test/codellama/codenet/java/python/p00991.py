<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.math.*;
class p00991{
	public static void main(String[]Z){
		Scanner cin=new Scanner(System.in);
		int r=cin.nextInt(),c=cin.nextInt(),a1=cin.nextInt(),a2=cin.nextInt(),b1=cin.nextInt(),b2=cin.nextInt();
		int x=Math.abs(a1-b1),y=Math.abs(a2-b2);
		x=Math.min(x,r-x);y=Math.min(y,c-y);
		int z=1,C=Math.min(x,y);
		if(x==r-x)z*=2;
		if(y==c-y)z*=2;
		BigInteger b=BigInteger.ONE;
		for(int i=0;i<C;i++)b=b.multiply(new BigInteger(String.valueOf(x+y-i))).divide(new BigInteger(String.valueOf(i+1)));
		System.out.println(b.multiply(new BigInteger(String.valueOf(z))).mod(new BigInteger("100000007")));
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import math
import sys

r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())

x = abs(a1 - b1)
y = abs(a2 - b2)

x = min(x, r - x)
y = min(y, c - y)

z = 1
if x == r - x:
    z *= 2
if y == c - y:
    z *= 2

b = 1
for i in range(min(x, y)):
    b *= (x + y - i) // (i + 1)

print(b * z % 100000007)
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to calculate the absolute value of the differences between the two points, and the `sys` module to read input from stdin. The rest of the code is similar to the Java code, with the exception of the `BigInteger` class, which is not available in Python. Instead, we use the `//` operator to perform integer division and the `%` operator to perform modulo arithmetic.</s>
