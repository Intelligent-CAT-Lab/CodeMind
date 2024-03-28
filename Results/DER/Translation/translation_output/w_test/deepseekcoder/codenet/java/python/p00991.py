<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
2


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

This Python code reads the input from the standard input, converts it to the appropriate types, and then calls the `solve` function with the converted inputs. The `solve` function calculates the result as per the Java code. The result is printed to the standard output.
<|EOT|>
