<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
-56

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
[/INST]
```python
import math

def main():
    r, c, a1, a2, b1, b2 = map(int, input().split())
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
        b = b * (x + y - i) // (i + 1)
    print(b * z % 100000007)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. The main differences are:

* The `Scanner` class is not used in Python, instead the `input()` function is used to read the input.
* The `Math` class is not used in Python, instead the `abs()`, `min()`, and `pow()` functions are used.
* The `BigInteger` class is not used in Python, instead the `int` type is used.
* The `String.valueOf()` method is not used in Python, instead the `str()` function is used.
* The `System.out.println()` method is not used in Python, instead the `print()` function is used.
* The `mod()` method is not used in Python, instead the `%` operator is used.</s>
