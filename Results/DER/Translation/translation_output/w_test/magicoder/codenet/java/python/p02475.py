<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# Python code

import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(a // b)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `map()` function is used to convert the input strings into integers. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
