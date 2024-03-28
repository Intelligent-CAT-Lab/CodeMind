<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
3.000000 0


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

python code:<fim_suffix><fim_middle>

```python
import sys

w,h,x,y=map(int,sys.stdin.readline().split())
print(w*h/2)
if x+x==w and y+y==h:
	print(1)
else:
	print(0)
```
<|endoftext|>
