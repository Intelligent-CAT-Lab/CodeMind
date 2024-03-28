<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys
import math
from math import gcd
from functools import reduce

def nCr(n, r):
    r = min(r, n-r)
    numer = reduce(lambda x, y: x * y, range(n, n-r, -1))
    denom = reduce(lambda x, y: x * y, range(1, r+1))
    return numer // denom

def main():
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
    x, y = abs(a1 - b1), abs(a2 - b2)
    x, y = min(x, r - x), min(y, c - y)
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    C = min(x, y)
    print(nCr(x + y, C) * z % 100000007)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads in the input, calculates the minimum distance between the two points, and then calculates the number of ways to choose `C` points from the total distance, where `C` is the minimum of `x` and `y`. The result is then printed out modulo 100000007.<｜end▁of▁sentence｜>
