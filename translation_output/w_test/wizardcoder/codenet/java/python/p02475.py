Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
0


```
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.*;
import java.util.*;
public class p02475
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger a=scan.nextBigInteger();
		BigInteger b=scan.nextBigInteger();
		System.out.println(a.divide(b));
	}
}


```

### Response:
```python
import math
a, b = map(int, input().split())
print(math.floor(a/b))
```

Explanation:

- We first import the math module to use the floor function.
- We take input from the user using the input() function and split it into two variables a and b using the split() function.
- We then use the floor function to find the quotient of a and b and print it.<|endoftext|>
