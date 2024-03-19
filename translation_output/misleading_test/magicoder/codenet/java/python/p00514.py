<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
87

```
import java.util.*;
import java.math.*;
class p00514{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a*b>c){
			System.out.println(0);
			System.exit(0);
		}
		c-=a*b;
		int d=c+a-1;
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<c;i++){
			bi=bi.multiply(new BigInteger(""+(d-i)));
			bi=bi.divide(new BigInteger(""+(i+1)));
		}
		System.out.println(bi.toString());
	}
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys
import math

def main():
    a, b, c = map(int, input().split())
    if a * b > c:
        print(0)
        sys.exit(0)
    c -= a * b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi *= (d - i)
        bi //= (i + 1)
    print(bi)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the input, checks if the product of the first two is greater than the third, and if so, it prints 0 and exits. If not, it calculates the value of `d` and then calculates the value of `bi` using the same formula as in the Java code. Finally, it prints the value of `bi`.<｜end▁of▁sentence｜>
