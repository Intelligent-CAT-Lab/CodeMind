<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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
	

Translate the above java code to python.

python code:

[/INST]
```python
import sys

w, h, x, y = map(int, sys.stdin.readline().split())
ans = w * h / 2
a = 0
if x + x == w and y + y == h:
    a = 1
print(ans, a)
```
Note: The `map` function is used to convert the input from a string to an integer. The `split` function is used to split the input into a list of strings, and the `int` function is used to convert each string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream.</s>
