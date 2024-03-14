<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03861 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x=sc.nextLong();
		long count=0;
		count=b/x-a/x;
		if(a%x==0)count++;
		System.out.println(count);
	}
}
	
```

### Response:
```python
import sys

def p03861():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())
    count = 0
    count = b//x - a//x
    if a % x == 0:
        count += 1
    print(count)

p03861()
```

This Python code does the same thing as the Java code. It reads three long integers from the standard input, calculates the count of numbers between `a` and `b` that are divisible by `x`, and prints the result. The `//` operator in Python is equivalent to the `/` operator in Java, but it performs integer division instead of floating-point division.
<|EOT|>
