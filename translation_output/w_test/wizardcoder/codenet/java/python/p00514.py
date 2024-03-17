Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import math

a, b, c = map(int, input().split())

if a*b > c:
    print(0)
    exit()

c -= a*b
d = c + a - 1

bi = 1

for i in range(c):
    bi *= d - i
    bi //= i + 1

print(bi)
```

Explanation:

- We first import the `math` module to use the `gcd` function.
- We take input from the user using the `map` function and store it in variables `a`, `b`, and `c`.
- We check if `a*b` is greater than `c`. If it is, we print `0` and exit the program using the `exit` function.
- We subtract `a*b` from `c` to get the value of `d`.
- We initialize a variable `bi` to `1`.
- We use a `for` loop to iterate from `0` to `c-1`.
- Inside the loop, we multiply `bi` by `(d-i)` and divide it by `(i+1)`.
- Finally, we print the value of `bi` using the `print` function.<|endoftext|>
