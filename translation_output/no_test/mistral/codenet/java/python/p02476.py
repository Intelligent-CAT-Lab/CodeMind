<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    in = sys.stdin
    while in.has_next():
        a, b = in.next_bigint(), in.next_bigint()
        print(a % b)

if __name__ == '__main__':
    main()
```</s>
