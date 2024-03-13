<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    w, h, x, y = map(int, sys.stdin.readline().split())
    ans = (w * h) / 2
    a = 0
    if x + x == w and y + y == h:
        a = 1
    print(ans, a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the area of the rectangle and checks if the given coordinates are on the diagonal of the rectangle. The result is then printed to the standard output.<｜end▁of▁sentence｜>
