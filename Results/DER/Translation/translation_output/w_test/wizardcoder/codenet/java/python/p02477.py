Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


```
import java.util.*;
import java.math.*;

class p02477{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		BigInteger A = new BigInteger(str);
		str = sc.next();
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}


```

### Response:
```python
import sys

A, B = map(int, sys.stdin.readline().split())

print(A * B)
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We then read the input as two integers `A` and `B` using `map(int, sys.stdin.readline().split())`.
- We then print the product of `A` and `B` using `print(A * B)`.<|endoftext|>
