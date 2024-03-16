Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;
import java.math.*;
class p00991:
    def main(self,Z):
        cin=Scanner(System.in)
        r=cin.nextInt()
        c=cin.nextInt()
        a1=cin.nextInt()
        a2=cin.nextInt()
        b1=cin.nextInt()
        b2=cin.nextInt()
        x=abs(a1-b1)
        y=abs(a2-b2)
        x=min(x,r-x)
        y=min(y,c-y)
        z=1
        C=min(x,y)
        if(x==r-x):
            z*=2
        if(y==c-y):
            z*=2
        b=BigInteger.ONE
        for i in range(C):
            b=b.multiply(BigInteger(str(x+y-i))).divide(BigInteger(str(i+1)))
        System.out.println(b.multiply(BigInteger(str(z))).mod(BigInteger("100000007")))
```<|endoftext|>
