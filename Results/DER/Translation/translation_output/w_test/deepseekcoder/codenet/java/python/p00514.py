<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
4


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

### Response:
```python
import sys
from math import comb

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a * b > c:
        print(0)
        sys.exit(0)
    c -= a * b
    d = c + a - 1
    print(comb(d, c))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, checks if the product of the first two integers is greater than the third one, and if it is, it prints 0 and exits. If not, it subtracts the product from the third integer and calculates the combination of the resulting number and the original third integer. The result is printed to the standard output.
<|EOT|>
