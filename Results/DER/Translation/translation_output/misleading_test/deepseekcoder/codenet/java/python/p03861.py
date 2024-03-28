<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
85

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
def p03861():
    a, b, x = map(int, input().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)

p03861()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the count of numbers between `a` and `b` that are divisible by `x`, and prints the result.
<|EOT|>
