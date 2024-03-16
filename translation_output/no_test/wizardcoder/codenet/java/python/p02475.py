Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.math.BigInteger
import java.util.Scanner

def main():
    scan = Scanner(System.in)
    a = BigInteger(scan.nextBigInteger())
    b = BigInteger(scan.nextBigInteger())
    System.out.println(a.divide(b))

if __name__ == '__main__':
    main()
```

Note: The `BigInteger` class in Java is replaced by the `BigInteger` class in Python. Also, the `import` statements have been modified to match the Python syntax.<|endoftext|>
