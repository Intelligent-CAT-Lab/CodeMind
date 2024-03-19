<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
-87.672301595963 43

```
import java.util.*;
import java.io.*;

public class p03001
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
		int h=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		double ans=(double)w*(double)h/2;
		int a=0;
		if(x+x==w&&y+y==h)
			a=1;
		System.out.println(ans+" "+a);
	}
}
	
```
[/INST]
```
import math

w, h, x, y = map(int, input().split())

ans = w * h / 2
a = 0
if x + x == w and y + y == h:
    a = 1

print(ans, a)
```
Note: The `map` function is used to convert the input string to a list of integers, and the `input` function is used to read a line of input from the user. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `if` statement is used to check if the condition `x + x == w and y + y == h` is true, and if it is, the variable `a` is set to 1. Finally, the `print` function is used to print the result.</s>
