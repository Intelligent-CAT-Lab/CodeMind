<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1


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
s = int(input())
a = 1000000000
print("0 0", a, "1", (a - s % a) % a, (s - 1) // a + 1)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the remainder of the division of the input by 1000000000, and prints the result. The result is a string of six numbers separated by spaces. The first two numbers are always 0, the third number is always 1000000000, the fourth number is the remainder of the division of the input by 1000000000, and the fifth number is the integer division of the input by 1000000000 plus one.
<|EOT|>
