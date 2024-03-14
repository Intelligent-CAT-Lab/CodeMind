<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys
from math import gcd

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a // b)

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, divides the first by the second, and prints the result. It uses the `//` operator for integer division, which is equivalent to the `divide` method in the Java code.
<|EOT|>
