<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

### Response:
```python
import sys
from math import *
from functools import reduce

def solve(r, c, a1, a2, b1, b2):
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    C = min(x, y)
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    b = reduce(lambda a, b: a * b, range(x + y - C + 1, x + y + 1)) // reduce(lambda a, b: a * b, range(1, C + 1))
    return b * z % 100000007

r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
print(solve(r, c, a1, a2, b1, b2))
```

This Python code does the same thing as the Java code. It reads in six integers from the standard input, calculates the minimum distance between the two points, and then calculates the number of ways to choose that many points from a grid of size `r` by `c`, taking into account the direction of the points. The result is then printed modulo 100000007.
<|EOT|>
