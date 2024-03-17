<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys
import math

def main():
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
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
    b = 1
    for i in range(C):
        b = (b * (x + y - i)) // (i + 1)
    print(b * z % 100000007)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, calculates the minimum distance between the two points, and then calculates the number of ways to choose `C` steps from the total of `x + y` steps, where `C` is the minimum of `x` and `y`. The result is then multiplied by `z` (which is either 1 or 2) and then modulo 100000007 to ensure the result is within the range of a 32-bit integer.<｜end▁of▁sentence｜>
