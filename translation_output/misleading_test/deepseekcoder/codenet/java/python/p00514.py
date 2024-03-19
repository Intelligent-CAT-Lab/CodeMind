<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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
    result = 1
    for i in range(c):
        result *= (d - i)
        result //= (i + 1)
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, checks if the product of the first two integers is greater than the third one, and if it is, it prints 0 and exits. If not, it calculates the binomial coefficient of `(c + a - 1)` choose `c` and prints the result.
<|EOT|>
