<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
-58

```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```

@@ Response
```python
a, b, n = map(int, input().split())
if n >= b:
    print(a*(b-1)//b)
else:
    print(a*n//b)
```

This Python code does the same thing as the Java code. It reads three integers from the input, and then checks if `n` is greater than or equal to `b`. If it is, it prints the result of `a*(b-1)//b`. If `n` is less than `b`, it prints the result of `a*n//b`. The `//` operator performs integer division in Python, which is equivalent to `/` in Java but rounds down to the nearest integer.<｜end▁of▁sentence｜>
