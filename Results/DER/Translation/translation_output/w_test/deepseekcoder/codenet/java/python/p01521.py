<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}
```

### Response:
```python
def p01521(s):
    return 'x' if s[0] == 'x' and s[-1] == 'x' else 'o'

print(p01521(input()))
```

This Python code does the same thing as the Java code. It reads a string from the input, checks if the first and last characters of the string are 'x', and returns 'x' if they are, otherwise it returns 'o'.
<|EOT|>
