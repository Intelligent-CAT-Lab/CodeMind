<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    a, b, c = map(int, input().split())
    if a * b > c:
        print(0)
        return
    c -= a * b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= d - i
        result //= i + 1
    print(result)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `map` function is used to convert the input from a string to a list of integers, and the `range` function is used to iterate over the values of `c`. The `//` operator is used for integer division, which is equivalent to the `divide` method in Java. The `BigInteger` class is not needed in Python, as it is not necessary to handle large integers.</s>
