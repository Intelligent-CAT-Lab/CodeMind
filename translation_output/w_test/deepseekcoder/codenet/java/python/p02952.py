<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
9


```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2 != 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```

### Response:
```python
def p02952(n):
    c = 0
    for i in range(1, n+1):
        if len(str(i)) % 2 != 0:
            c += 1
    return c

print(p02952(11))
```

This Python code does the same thing as the Java code. It counts the number of integers from 1 to n (inclusive) that have an odd number of digits. The function `p02952` takes an integer `n` as input and returns the count `c`. The `print` statement at the end is used to test the function with the input 11.
<|EOT|>
