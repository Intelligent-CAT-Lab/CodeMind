<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


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

def main():
    A, B = map(int, sys.stdin.readline().split())
    print(A * B)

if __name__ == "__main__":
    main()
```

In this Python code, we use the built-in `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input strings to integers. The multiplication operation is then performed and the result is printed to the standard output.
<|EOT|>
