Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import math
import sys

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def binomial_coefficient(n, k):
    return factorial(n) // (factorial(k) * factorial(n-k))

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a*b > c:
        print(0)
        sys.exit(0)
    c -= a*b
    d = c + a - 1
    result = 1
    for i in range(c):
        result *= d - i
        result //= i + 1
    print(result)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the necessary modules for the program to work.
- We define a function `factorial` to calculate the factorial of a number.
- We define a function `binomial_coefficient` to calculate the binomial coefficient of two numbers.
- We define the `main` function which reads the input from the user, checks if the condition is satisfied, calculates the remaining value of `c`, and then calculates the result using the binomial coefficient formula.
- Finally, we print the result.<|endoftext|>
