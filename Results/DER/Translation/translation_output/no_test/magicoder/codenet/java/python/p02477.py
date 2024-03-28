<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    A = sys.stdin.readline().strip()
    B = sys.stdin.readline().strip()
    print(int(A) * int(B))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers from the standard input, converts them to integers, multiplies them, and then prints the result. The `strip()` function is used to remove the newline character that `sys.stdin.readline()` reads.<｜end▁of▁sentence｜>
