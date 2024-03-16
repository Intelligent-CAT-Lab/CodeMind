<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    a = int(input())
    b = int(input())
    c = int(input())
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

Please note that Python does not have a built-in BigInteger class like Java, so we use the `//` operator for integer division and `*` for multiplication. Also, Python's `input()` function is used to get user input, and `sys.exit(0)` is used to terminate the program.<｜end▁of▁sentence｜>
