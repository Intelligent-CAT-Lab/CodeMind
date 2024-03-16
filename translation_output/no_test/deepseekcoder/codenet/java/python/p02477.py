<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
from math import *

def main():
    str = sys.stdin.readline().strip()
    A = int(str)
    str = sys.stdin.readline().strip()
    B = int(str)
    print(A * B)

if __name__ == '__main__':
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, multiplies them together, and prints the result. The `strip()` function is used to remove the newline character at the end of the input strings.
<|EOT|>
