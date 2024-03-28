<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
3


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

@@ Response
```python
a, b, x = map(int, input().split())
count = b // x - a // x
if a % x == 0:
    count += 1
print(count)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the count of numbers between a and b that are divisible by x, and then prints the count.<｜end▁of▁sentence｜>
