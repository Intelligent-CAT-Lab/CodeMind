Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
        a = in.nextBigInteger()
        b = in.nextBigInteger()
        print(a.remainder(b))
    in.close()

if __name__ == '__main__':
    main()
```<|endoftext|>
