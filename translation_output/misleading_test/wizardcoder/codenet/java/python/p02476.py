Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
57

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
import java.io.BufferedInputStream
import java.math.BigInteger
import java.util.Scanner

def main():
    in = Scanner(BufferedInputStream(System.in))
    while in.hasNext():
        a = BigInteger(in.next())
        b = BigInteger(in.next())
        print(a.remainder(b))
    in.close()

if __name__ == '__main__':
    main()
```

Note: The `BigInteger` class in Java is replaced by the `int` and `str` data types in Python. Therefore, we need to convert the input values to `BigInteger` objects in Java and then convert them back to `int` or `str` in Python.<|endoftext|>
