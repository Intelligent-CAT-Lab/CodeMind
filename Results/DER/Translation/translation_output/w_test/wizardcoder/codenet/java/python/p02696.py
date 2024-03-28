Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```

### Response:
```python
import math

a = int(input())
b = int(input())
n = int(input())

if n >= b:
    print(a * (b - 1) // b)
else:
    print(a * n // b)
```

Explanation:

- We first import the `math` module to use the `//` operator for integer division.
- We read the input values `a`, `b`, and `n` using the `input()` function and convert them to integers using the `int()` function.
- We check if `n` is greater than or equal to `b`. If it is, we calculate `a * (b - 1) // b` and print the result. This is because the number of times `a` can be divided by `b` is equal to `b - 1`.
- If `n` is less than `b`, we calculate `a * n // b` and print the result. This is because the number of times `a` can be divided by `b` is equal to `n`.<|endoftext|>
