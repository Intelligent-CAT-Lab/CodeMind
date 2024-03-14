<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

### Response:
```python
import sys

def main():
    s = int(sys.stdin.readline())
    a = 1000000000
    print("0 0", a, 1, (a - s % a) % a, (s - 1) // a + 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from standard input, calculates the remainder of the division of the input by 1000000000, and prints five numbers: 0, 0, 1000000000, 1, and the remainder and the quotient of the division of the input by 1000000000 plus 1. The Python `//` operator is used for integer division, which discards the fractional part.
<|EOT|>
