<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

w, h, x, y = map(int, sys.stdin.readline().split())

if x + x == w and y + y == h:
    print(w * h / 2, 1)
else:
    print(w * h / 2, 0)
```
"""
<|endoftext|>
