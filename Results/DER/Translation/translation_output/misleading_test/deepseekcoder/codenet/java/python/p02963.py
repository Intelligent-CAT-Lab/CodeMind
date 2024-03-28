<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 0 1

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
    print("0 0", a, "1", (a - s % a) % a, (s - 1) // a + 1)

if __name__ == "__main__":
    main()
```

This Python code reads an integer from standard input, calculates the value of `a` as 1000000000, and then prints the result of the calculation. The calculation is based on the Java code you provided.
<|EOT|>
