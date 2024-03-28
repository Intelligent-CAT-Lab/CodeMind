Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
5


```
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class p02476 {
	public static void main(String []args)
	{
		Scanner in =new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
		{
			BigInteger a = in.nextBigInteger(),b = in.nextBigInteger();
			System.out.println(a.remainder(b));
		}
		in.close();
	}
}


```

### Response:
```python
import sys

while True:
    try:
        a, b = map(int, input().split())
        print(a % b)
    except EOFError:
        break
```

Explanation:

- We use the `map()` function to convert the input strings to integers.
- We use a `try-except` block to handle the case where the input is exhausted (i.e., there are no more lines to read).
- We use the `%` operator to compute the remainder of `a` divided by `b`.
- We print the result.<|endoftext|>
