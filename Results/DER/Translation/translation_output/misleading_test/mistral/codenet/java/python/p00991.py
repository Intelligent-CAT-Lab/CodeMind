<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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

def p00991():
    r, c, a1, a2, b1, b2 = map(int, input().split())
    x, y = abs(a1 - b1), abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z, C = 1, min(x, y)
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    b = math.bigdecimal.ONE
    for i in range(C):
        b = b * (math.bigdecimal(str(x + y - i)) / math.bigdecimal(str(i + 1)))
    return (b * math.bigdecimal(str(z))).mod(math.bigdecimal("100000007"))

# Test input
r, c, a1, a2, b1, b2 = map(int, input().split())

# Expected output
print(p00991())
```</s>
